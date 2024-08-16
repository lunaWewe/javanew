package tw.luna.pretty;

import tw.luna.apis.Scooter;

public class Scooter13 {

	public static void main(String[] args) {
		Scooter s1 = new Scooter();  // Scooter()呼叫建構式 // new: 產生物件實體
		s1.changGear(2);
		s1.upSpeed();s1.upSpeed();
		System.out.println(s1.getSpeed());
		s1.changGear(0);
		s1.upSpeed();s1.upSpeed();
		System.out.println(s1.getSpeed());
		System.out.println(s1.getColor());
		
		
		
	}

}
