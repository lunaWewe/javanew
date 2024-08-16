package tw.luna.pretty;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class Luna57 {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://www.iii.org.tw");
			URLConnection conn = url.openConnection();

			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(bin));

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			bin.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
