package tw.luna.pretty;

import java.io.FileOutputStream;

public class Luna42 {

	public static void main(String[] args) {
		String mesg = "Hello, 資展\n";
		
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file3.txt",true);
			
			fout.write(mesg.getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
