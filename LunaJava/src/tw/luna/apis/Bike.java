package tw.luna.apis;

import java.io.Serializable;

public class Bike extends Object implements Serializable{
	protected double speed;
	
	public Bike() {
		// super();
		System.out.println("Bike()");
	}

	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.4;

	}

	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.7;

	}
	
	public double getSpeed() {
		return speed;
	}
	public String toString() {
		return "I am Bike" + speed;
	}
}
