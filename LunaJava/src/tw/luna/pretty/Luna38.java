package tw.luna.pretty;

public class Luna38 {

	public static void main(String[] args) {
		Luna381 obj = new Luna381();
		try {
			obj.m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Luna381 {
	void m1() throws Exception {
		System.out.println("Luna381:m1()");
		m2();
	}

	void m2() throws Exception {
		System.out.println("Luna381:m2()");
		m3();
	}

	void m3() throws Exception {
		System.out.println("Luna381:m3()");
		throw new Exception();
	}
}