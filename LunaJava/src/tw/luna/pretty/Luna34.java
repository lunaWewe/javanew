package tw.luna.pretty;

import java.io.File;

public class Luna34 {

	public static void main(String[] args) {
		File f1 = new File("d:/dir2");
		File f2 = new File("d:/test1");
		if (f1.exists()) {
			System.out.println("OK");
		} else {
			System.out.println("XX");
		}
		f1.mkdir();
		File nowDir = new File(".");
		System.out.println(nowDir.getAbsolutePath());
	}
}
