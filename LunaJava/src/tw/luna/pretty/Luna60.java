package tw.luna.pretty;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

public class Luna60 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("dir2/gamer.pdf");
			
			URL url = new URL("https://pdfmyurl.com/?url=https://www.gamer.com.tw");
			URLConnection conn =  url.openConnection();
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			
			byte[] buf = new byte[4*1024]; int len;
			while ( (len = bin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			bin.close();
			
			fout.flush();
			fout.close();
			System.out.println("OK");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
