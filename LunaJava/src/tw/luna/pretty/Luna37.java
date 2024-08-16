package tw.luna.pretty;

public class Luna37 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		
		try {
			b1.setLeg(7);
		} catch (Exception e) {
			System.out.println("Oooooop!");
		}
		
	}

}

class Bird {
	private int leg;

	void setLeg(int leg) throws Exception {
		if (leg >= 0 && leg <= 2) {
			this.leg = leg;
		}else {
			throw new Exception()
;		}

	}
}
