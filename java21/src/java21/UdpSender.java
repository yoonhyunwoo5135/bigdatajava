package java21;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpSender {

	public static void main(String[] args) throws Exception {
		//��Ʈ��ũ ����� ������ �־�� ��.
		DatagramSocket socket = new DatagramSocket();
		
		//�������� ��Ŷ�� �����Ѵ�.
		String str = "I am a java programmer";
		byte[] data = str.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet
				= new DatagramPacket(data , data.length, ip, 7000);
		socket.send(packet);
		socket.close();
		
	}

}
