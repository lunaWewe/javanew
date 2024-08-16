package tw.luna.pretty;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Luna52 {

	public static void main(String[] args) {
		try {
			// www 電腦名稱 // iii.org.tw 網域
			InetAddress ip = InetAddress.getByName("www.iii.org.tw");
			System.out.println(ip);
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
		
	}

}
