package tw.luna.pretty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Luna41 {

	public static void main(String[] args) {

		try {
			File source = new File("./dir1/file2.txt");
			FileInputStream fin = new FileInputStream(source);

			int len;
			byte[] buf = new byte[(int)source.length()];

			while ((len = fin.read(buf)) != -1) {

				System.out.print(new String(buf));
			}

			fin.close();
			System.out.println();
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
