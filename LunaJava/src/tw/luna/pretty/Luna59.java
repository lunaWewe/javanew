package tw.luna.pretty;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

public class Luna59 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("dir2/yahoo.jpg");
			
			URL url = new URL("https://s.yimg.com/ny/api/res/1.2/E2uvw7KZueJw03zpoXWjFQ--/YXBwaWQ9aGlnaGxhbmRlcjt3PTk2MDtoPTY0MDtjZj13ZWJw/https://media.zenfs.com/ko/gotv_ctitv_com_tw_678/cea78a73385761458a2377eeedede02a");
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
			System.out.println(e);
		}

	}

}
