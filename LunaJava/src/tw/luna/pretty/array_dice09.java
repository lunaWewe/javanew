package tw.luna.pretty;

import javax.swing.SwingUtilities;

public class array_dice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = new int[7];

		for (int i = 0; i < 100; i++) {
			int point = (int) (Math.random() * 6 + 1);
			if (point >= 1 && point <= 6) {
				p[point]++;
			}
		}

		if (p[0] > 0) {
			System.out.println("Err");
		} else {
			for (int i = 1; i < p.length; i++) {
				System.out.printf("%d點出現%d次\n", i, p[i]);
			}
		}

	}

}
