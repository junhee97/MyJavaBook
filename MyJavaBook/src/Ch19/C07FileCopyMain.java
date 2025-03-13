package Ch19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\IOTEST\\data.pptx");
		OutputStream out = new FileOutputStream("C:\\IOTEST\\copy_data.pptx");

		// 01 버퍼 미사용
//		System.out.println("진행중 - ");
//		while (true) {
//			int data = in.read();
//			if(data == -1)
//				break;
//			out.write((byte) data);
//			out.flush();
//		}
//		in.close();
//		out.close();
//		System.out.println("진행완료 ! ");

		// 02 버퍼 사용
		System.out.println("진행중 - ");
		byte[] buff = new byte[4096];
		while (true) {
			int data = in.read(buff);
			if (data == -1)
				break;
//			out.write((byte) data);
			out.write(buff, 0, data);
			out.flush();
		}
		in.close();
		out.close();
		System.out.println("진행완료 ! ");

	}

}
