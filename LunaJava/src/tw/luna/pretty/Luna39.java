package tw.luna.pretty;

public class Luna39 {

	public static void main(String[] args) {
		m1();
		System.out.println("Game over");

	}

	static void m1() {
		System.out.println("1");
		int[] a = { 1, 2, 3, 4 };

		try {
			System.out.println(a[10]);
			System.out.println("Luna");
		} catch (Exception e) {
			System.out.println(e);
			return;
		} finally {
			System.out.println("f");
		}

		System.out.println("OK");
	}

}
