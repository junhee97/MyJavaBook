package Ch22;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {

	public static void main(String[] args) throws IOException {

		// 서버 소켓 생성
		ServerSocket server = new ServerSocket(7000); // 포트번호 지정 192.168.16.131:7000
		System.out.println("[INFO] SERVER SOCKET LISTENING");

		//
		Socket client = server.accept();

		//
		OutputStream out = client.getOutputStream();
		DataOutputStream dout = new DataOutputStream(out);

		dout.writeUTF("[INFO] WELCOME TO SERVER");
		dout.flush();
		dout.close();
		out.close();
		client.close();
		server.close();

		System.out.println("서버 종료합니다");

	}

}
