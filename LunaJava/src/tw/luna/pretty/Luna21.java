package tw.luna.pretty;

public class Luna21 {

	public static void main(String[] args) {
		Luna211 obj1 = new Luna211() {
			
			// 一次性使用方式
			void m2() {
				System.out.println("Luna211:m2()");
			}
		};
		obj1.m1();obj1.m2(); // Luna211:m1()  Luna211:m2()
		
		Luna211 obj2 =new Luna212();
		obj2.m1();obj2.m2(); // Luna211:m1()  Luna212:m2()

	}
}


// 具有抽象方法的類別，需要宣告抽象方法
abstract class Luna211 {
	void m1() {System.out.println("Luna211:m1()");}
	abstract void m2();
}

class Luna212 extends Luna211 {
	void m2() {System.out.println("Luna212:m2()");}
}

class Luna213 extends Luna211{
	void m2() {System.out.println("Luna213:m2");}
}

abstract class Luna214{
	
}