package tw.luna.pretty;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.luna.apis.Student;

public class Luna49 {

	public static void main(String[] args) {
		Student s1 = new Student("Luna", 40, 72, 53);
		System.out.println(s1);
		System.out.println(s1.sum());
		System.out.println(s1.avg());

		try {
			FileOutputStream fOut = new FileOutputStream("dir1/luna.score");
			ObjectOutputStream oout = new ObjectOutputStream(fOut);
			
			oout.writeObject(s1);
			
			oout.flush();
			oout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
