package tw.luna.pretty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Luna35 {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fInputStream =new FileInputStream("./dir1/file1.txt");
		System.out.println(fInputStream.toString());
	}

}
