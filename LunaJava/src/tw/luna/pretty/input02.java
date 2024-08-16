package tw.luna.pretty;

import java.util.Scanner;

public class input02 {

	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
		System.out.print("x = ");
		int x = scanner.nextInt();
		System.out.print("y = ");
		int y = scanner.nextInt();

		// op..
		int r = x + y;
		int s = x - y;
		int p = x * y;
		int m = x / y;
		int m2 = x % y;
		

		// output
		System.out.printf("%d + %d = %d\n", x, y, r);
		System.out.printf("%d - %d = %d\n", x, y, s);
		System.out.printf("%d * %d = %d\n", x, y, p);
		System.out.printf("%d / %d = %d......%d\n", x, y, m,m2);


	}

}
