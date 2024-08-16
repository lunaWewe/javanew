package tw.luna.pretty;

public class array10 {

	public static void main(String[] args) {
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];

		for (int[] a1 : a) {
			for(int v :a1) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
	}

}
