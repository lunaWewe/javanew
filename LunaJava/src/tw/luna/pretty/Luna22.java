package tw.luna.pretty;

public class Luna22 {

	public static void main(String[] args) {
		Luna221 obj1 = new Luna222();
		Luna223 obj2 = new Luna222();
		Luna222 obj3 = new Luna222();
		obj1.m1();
		obj2.m3();
		obj3.m4();

	}

}

// 介面內只要定義規格，裡面的方法必須是 public
interface Luna221 {
	void m1();

	void m2();
}

interface Luna223 {
	void m3();

	void m4();
}

// 沒寫父類別就是 Object
class Luna222 implements Luna221, Luna223 {
	public void m1() {
	}

	public void m2() {
	}

	public void m3() {
	}

	public void m4() {
	}
}