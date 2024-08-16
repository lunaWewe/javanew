package tw.luna.pretty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Luna43 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			byte[] buf = new byte[4 * 1024];

			FileInputStream fin = new FileInputStream("dir1/test1.jpg");
			FileOutputStream fout = new FileOutputStream("dir2/test2.jpg");

			int len;
			while ((len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}

			fin.close();
			fout.close();
			fout.flush();
			System.out.println("Finish");
			System.out.println(System.currentTimeMillis() - start);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
