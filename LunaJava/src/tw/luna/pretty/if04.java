package tw.luna.pretty;

public class if04 {
	public static void main(String[] arg) {
		double temp = Math.random();
		int score = (int) (temp * 101) + 0; // 0 ~ 100
		System.out.println(score);

		// 防火牆 如果封包長怎樣就怎樣
		// 長出現放前面以減少判斷
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

	}
}
