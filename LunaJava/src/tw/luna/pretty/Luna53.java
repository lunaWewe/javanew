package tw.luna.pretty;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Luna53 {

	public static void main(String[] args) {

		try {
			String mesg = "666";
			byte[] mesgBuf = mesg.getBytes();
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(mesgBuf, mesgBuf.length, InetAddress.getByName("10.0.100.192"),
					8888);
			socket.send(packet);
			socket.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
