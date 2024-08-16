package tw.luna.pretty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Luna33 {

	public static void main(String[] args) {
//		System.out.println(File.pathSeparator);
//		System.out.println(File.separator);
		try {
			FileInputStream fin = new FileInputStream("./dir1/file1.txt");

			int c;
			while ((c = fin.read()) != -1) {
				System.out.print((char)c);
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
