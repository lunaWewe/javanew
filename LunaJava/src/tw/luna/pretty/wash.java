package tw.luna.pretty;

public class wash {

	public static void main(String[] args) {
		int a = 10, b = 3;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.printf("a=%d,b=%d", a, b);

		int c = 3, d = 2;
		System.out.println(c ^ d);

	}

}
