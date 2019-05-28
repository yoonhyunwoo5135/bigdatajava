package java21;

import java.net.Socket;

public class TcpClient3 {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 9100);
		System.out.println("client 3: 서버와 연결 성공..!!!");
	}

}
