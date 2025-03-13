package Ch19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

class C08GUI extends JFrame implements ActionListener, KeyListener, MouseListener {
	JTextArea area1;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton input;
	JTextField txt1;
	Writer out;

	public C08GUI(String title) {
		// Frame
		super(title);
		setBounds(100, 100, 400, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Panel
		JPanel panel = new JPanel();
		panel.setLayout(null);

		// Component 참조변수명
		area1 = new JTextArea(); // textarea = area1
		JScrollPane scroll1 = new JScrollPane(area1); // textarea's scroll = scroll1
		scroll1.setBounds(20, 20, 200, 300);

		btn1 = new JButton("저장하기"); // 파일로저장 : btn1
		btn1.setBounds(240, 20, 120, 40);

		btn2 = new JButton("불러오기"); // 1:1요청 : btn2
		btn2.setBounds(240, 100, 120, 40);

		btn3 = new JButton("대화기록보기"); // 대화기록보기 : btn3
		btn3.setBounds(240, 180, 120, 40);

		input = new JButton("입력"); // 입력 : input
		input.setBounds(240, 350, 120, 40);

		txt1 = new JTextField(); // textfield : txt1
		txt1.setBounds(20, 350, 200, 40);

		// event listener add
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		input.addActionListener(this);
		txt1.addKeyListener(this);
		area1.addMouseListener(this);

		// Panel(Component)
		panel.add(scroll1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(input);
		panel.add(txt1);

		// Frame(Panel)
		add(panel);

		// Frame
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

//		System.out.println("Click!");
		if (e.getSource() == btn1) {
			System.out.println("[Click!] 저장하기");
			String contents = area1.getText();

			// 파일탐색기 열기
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("파일 저장 위치를 선택하세요");
			fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

			File defaultDirPath = new File("C:\\IOTEST");
			if (defaultDirPath.exists())
				fileChooser.setCurrentDirectory(defaultDirPath);

			int selectedVal = fileChooser.showSaveDialog(null);
			System.out.println("selectedVal : " + selectedVal);

			if (selectedVal == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fileChooser.getSelectedFile();
				System.out.println("selectedFile : " + selectedFile);

				// 파일확장자 추가
				String filePath = selectedFile.toString();
				if (!selectedFile.toString().endsWith(".txt")) {
					filePath = selectedFile.toString() + ".txt";
				}
				System.out.println("filePath : " + filePath);
//				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
//				String filename = LocalDateTime.now().format(formatter);
				try {
					out = new FileWriter(filePath);
					out.write(contents);
					out.flush();
				} catch (Exception e1) {
					e1.printStackTrace();
				} finally {
					try {
						out.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		} else if (e.getSource() == btn2) {
			System.out.println("[Click!] 불러오기");
			// 파일탐색기 열기
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("파일을 선택하세요");
			fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

			File defaultDirPath = new File("C:\\IOTEST");
			if (defaultDirPath.exists())
				fileChooser.setCurrentDirectory(defaultDirPath);

			int selectedVal = fileChooser.showOpenDialog(null);
			System.out.println("selectedVal : " + selectedVal);

			if (selectedVal == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fileChooser.getSelectedFile();
				System.out.println("selectedFile : " + selectedFile);
				try {
					Reader fin = new FileReader(selectedFile.toString());
					StringBuffer buffer = new StringBuffer();
					while (true) {
						int data = fin.read();
						if (data == -1)
							break;
						buffer.append((char) data);
					}
					area1.setText("");
					area1.append(buffer.toString());
					fin.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

		} else if (e.getSource() == btn3) {
			System.out.println("[Click!] 대화기록보기");
		} else if (e.getSource() == input) {
			System.out.println("[Click!] 입력");
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

//		System.out.println("keyTyped..." + e.getKeyChar());
//		System.out.println("keyTyped..." + e.getKeyCode());

	}

	@Override
	public void keyPressed(KeyEvent e) {

//		System.out.println("keyPressed..." + e.getKeyChar());
//		System.out.println("keyPressed..." + e.getKeyCode());
		if (e.getSource() == txt1) {
			if (e.getKeyCode() == 10) {
				String message = txt1.getText();
				System.out.println(message);
				area1.append(message + "\n");
				txt1.setText("");
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

//		System.out.println("keyReleased..." + e.getKeyChar());
//		System.out.println("keyReleased..." + e.getKeyCode());

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		try {
//			System.out.println("MouseClicked... " + e.getPoint());
			int offset = area1.viewToModel(e.getPoint());
//			System.out.println("MouseClicked...offset " + offset);
			int row = area1.getLineOfOffset(offset);
//			System.out.println("MouseClicked...row " + row);
			int startOffset = area1.getLineStartOffset(row);
			int endOffset = area1.getLineEndOffset(row);
//			System.out.printf("%d %d\n", startOffset, endOffset);
			String str = area1.getText(startOffset, endOffset - startOffset);
			System.out.println(str);
		} catch (BadLocationException e1) {
			e1.printStackTrace();
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}

public class C08SwingEventMain {

	public static void main(String[] args) {

		new C08GUI("Chatting Server");

	}

}
