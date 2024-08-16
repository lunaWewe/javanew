package tw.luna.pretty;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Luna56 {

	public static void main(String[] args) {
		while (true) {
			try (ServerSocket server = new ServerSocket(7777); Socket socket = server.accept();) {

				String urIp = socket.getInetAddress().getHostAddress();

				String fname = String.format("dir2/%s.jpg", urIp);
				BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(fname));
				BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());

				byte[] buf = new byte[4 * 1024];
				int len;
				while ((len = bin.read(buf)) != -1) {
					bout.write(buf, 0, len);
				}

				bout.flush();
				bout.close();
				System.out.print(urIp + " => OK");

			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
