package tw.luna.apis;

import java.security.PublicKey;

public class Scooter extends Bike {
	private int gear;
	private String color;

	// 建構式: 物件初始化
	// 建構式不是用來產生物件實體
	public Scooter() {
		System.out.println("Scooter ()");
		color = "Yellow";
	}
	
	public Scooter (String color) {
		System.out.println("Scooter (String color)");
		this.color = color;
	}

	public void changGear(int gear) {
		if (gear >= 0 && gear <= 4) {
			this.gear = gear;

		}
	}

	public void upSpeed() {
		super.upSpeed(); // 父類別的物件實體
		if (gear > 0) {
			speed = speed < 1 ? 1 : speed * 1.8 * gear;
		}

	}


	public String getColor() {
		return color;
	}
}
