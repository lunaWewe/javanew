package tw.luna.pretty;

import tw.luna.apis.Bike;

public class object12 {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		System.out.println(myBike.getSpeed());

		myBike.upSpeed();
		myBike.upSpeed();
		System.out.println(myBike.getSpeed());
		System.out.println("--------");

		for (int i = 0; i < 20; i++) {
			myBike.upSpeed();
		}
		System.out.println(myBike.getSpeed());
	}

}
