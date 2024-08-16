package tw.luna.pretty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class CSVpractice {

	public static void main(String[] args) {
		try {
			FileInputStream fin =new FileInputStream("./dir1/BGMOPEN1.csv");
			InputStreamReader reader = new InputStreamReader(fin);
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		

	}

}
