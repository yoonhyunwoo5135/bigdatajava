package java21;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9100);
		System.out.println("TCP ���� ���� ���۵�..");
		System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� ��....");
		while(true) {
			Socket socket = server.accept();
			System.out.println("Ŭ���̾�Ʈ�� ���� ����..!!");
		}
		
	}
}
