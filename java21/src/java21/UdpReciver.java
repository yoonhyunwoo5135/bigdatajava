package java21;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReciver {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(7000);
		System.out.println("�޴� �� ���� ����...");
		System.out.println("���� �غ� ��...");
		byte [] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		socket.receive(packet);
		System.out.println(new String(data));
		socket.close();
	}

}
