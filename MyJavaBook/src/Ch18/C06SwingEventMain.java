package Ch18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C06GUI extends JFrame implements ActionListener {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton input;

	public C06GUI(String title) {
		// Frame
		super(title);
		setBounds(100, 100, 400, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Panel
		JPanel panel = new JPanel();
		panel.setLayout(null);

		// Component 참조변수명
		JTextArea area1 = new JTextArea(); // textarea = area1
		JScrollPane scroll1 = new JScrollPane(area1); // textarea's scroll = scroll1
		scroll1.setBounds(20, 20, 200, 300);

		btn1 = new JButton("파일로저장"); // 파일로저장 : btn1
		btn1.setBounds(240, 20, 120, 40);

		btn2 = new JButton("1:1 요청"); // 1:1요청 : btn2
		btn2.setBounds(240, 100, 120, 40);

		btn3 = new JButton("대화기록보기"); // 대화기록보기 : btn3
		btn3.setBounds(240, 180, 120, 40);

		input = new JButton("입력"); // 입력 : input
		input.setBounds(240, 350, 120, 40);

		JTextField txt1 = new JTextField(); // textfield : txt1
		txt1.setBounds(20, 350, 200, 40);

		// event listener add
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		input.addActionListener(this);

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
			System.out.println("[Click!] 파일로 저장");
		} else if (e.getSource() == btn2) {
			System.out.println("[Click!] 1:1 요청");
		} else if (e.getSource() == btn3) {
			System.out.println("[Click!] 대화기록보기");
		} else if (e.getSource() == input) {
			System.out.println("[Click!] 입력");
		}

	}

}

public class C06SwingEventMain {

	public static void main(String[] args) {

		new C06GUI("Chatting Server");

	}

}
