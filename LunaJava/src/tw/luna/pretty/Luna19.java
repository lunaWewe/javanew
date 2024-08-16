package tw.luna.pretty;

public class Luna19 {

	public static void main(String[] args) {
		Luna191 obj1 = new Luna191();
		obj1.m1(); obj1.m2();
		
		Luna192 obj2 = new Luna192();
		obj2.m1();obj2.m2(); obj2.m3();
		
		Luna191 obj3 = new Luna192();
		obj3.m1();obj3.m2();
		// Luna191:m1()
		// Luna192:m2()

		Luna192 obj4 = (Luna192)obj3;
		obj4.m1();obj4.m2();obj4.m3();
		// Luna191:m1()
		// Luna192:m2()
		// Luna192:m3()
		
//		Luna192 obj5 = new Luna193();
//		Luna193 obj6 = new Luna192();
		
		Luna191 obj7 = new Luna192();
//		Luna193 obj8 = (Luna193)obj7;
		
		if (obj7 instanceof Luna191) {
			System.out.println("Yes1");
		}else {
			System.out.println("No1");
		}
		
		if (obj7 instanceof Luna192) {
			System.out.println("Yes2");
		}else {
			System.out.println("No2");
		}
		
		if (obj7 instanceof Luna193) {
			System.out.println("Yes3");
		}else {
			System.out.println("No3");
		}
		

		
	}

}

class Luna191{
	void m1() {
		System.out.println("Luna191:m1()");
	}
	void m2() {
		System.out.println("Luna191:m2()");
	}
}

class Luna192 extends Luna191 {
	void m2() {
		System.out.println("Luna192:m2()");
	}
	void m3() {
		System.out.println("Luna192:m3()");
	}

}

class Luna193 extends Luna191 {
	void m2() {
		System.out.println("Luna193:m2()");
	}
	void m3() {
		System.out.println("Luna193:m3()");
	}

}