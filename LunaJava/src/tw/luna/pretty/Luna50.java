package tw.luna.pretty;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import tw.luna.apis.Student;

public class Luna50 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("./dir1/luna.score");
			ObjectInputStream oin = new ObjectInputStream(fin);

			Object obj = oin.readObject();
			Student s1 = (Student) obj;
			System.out.println(s1);
			System.out.println(s1.sum());
			System.out.println(s1.avg());

			if (obj instanceof Student) {
				System.out.println("Yes");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
