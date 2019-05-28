package java21;

import java.net.Socket;

public class TcpClient1 {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 9100);
		System.out.println("client 1: 서버와 연결 성공..!!!");
	}

}
