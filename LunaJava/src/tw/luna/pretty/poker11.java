package tw.luna.pretty;

public class poker11 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int temp = (int) (Math.random() * 52 + 1);
		boolean isRepeat = false;
		// 洗牌
		int[] poker = new int[52];
		
		
		for (int i = 0; i < poker.length; i++) {

			// 檢查機制

			for (int j = 0; j < i; j++) {
				if (temp == poker[j]) {
					// 重複了
					isRepeat = true;
					break;
				}

			}
			if (!isRepeat) {
				poker[i] = temp;
				System.out.println(poker[i]);
			} else {
				i--;
			}

		}
		System.out.println("---");
		System.out.println(System.currentTimeMillis() - start);
		// 發牌

		// 攤牌 + 裡牌

	}

}
