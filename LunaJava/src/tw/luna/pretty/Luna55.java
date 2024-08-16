package tw.luna.pretty;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Luna55 {

	public static void main(String[] args) {
//		for (int i = 0; i < 65536; i++) {
		File source =new File("dir1/bg2_1.jpg");
		
		try (
					
				BufferedInputStream bin =new BufferedInputStream(new FileInputStream(source));
				Socket client = new Socket(InetAddress.getByName("10.0.100.192"), 7777);
				BufferedOutputStream bout = new BufferedOutputStream(client.getOutputStream())) {

			
			byte[] buf = new byte[(int)source.length()];
			bin.read(buf);
			bout.write(buf);
			
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e);
		}

//		}
	}
}
