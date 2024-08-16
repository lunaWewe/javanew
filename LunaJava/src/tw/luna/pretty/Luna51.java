package tw.luna.pretty;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Luna51 {

	public static void main(String[] args) {
		Luna513 obj = new Luna513();

		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/test.ok"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("ok");
			System.out.println("--------");
			
			ObjectInputStream oin =new ObjectInputStream(new FileInputStream("dir1/test.ok"));
			oin.readObject();
			oin.close();
			System.out.println("OK2");
			} catch (Exception e) {
			System.out.println(e);
		}

	}

}

class Luna511 {
	public Luna511() {
		System.out.println("Luna511()");
	}
}

class Luna512 extends Luna511 {
	public Luna512() {
		System.out.println("Luna512()");
	}
}

class Luna513 extends Luna512 implements Serializable{
	public Luna513() {
		System.out.println("Luna513()");
	}
}