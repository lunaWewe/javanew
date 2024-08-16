package tw.luna.pretty;

public class Luna20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Luna201 obj1 = new Luna201();
		Luna202 obj2 = new Luna202();
		Luna203 obj3 = new Luna203();
		att(obj1);
		att(obj2);
		att(obj3);
	}
	static void att(Luna201 obj) {
		obj.m1();
	}

}

class Luna201 {
	void m1() {
		System.out.println("Luna201:m1");
	}
}

class Luna202 extends Luna201 {
	void m1() {
		System.out.println("Luna202:m1");
	}
}

class Luna203 extends Luna201 {
	void m1() {
		System.out.println("Luna203:m1");
	}
}