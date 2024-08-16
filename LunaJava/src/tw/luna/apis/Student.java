package tw.luna.apis;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private int math, ch, eng;
	private Bike bike;
	
	public Student(String name, int math, int ch, int eng) {
		this.name = name;
		this.math = math;
		this.ch = ch;
		this.eng = eng;
		bike = new Bike();
		
	}

	public int sum() {
		return math + ch + eng;
	}

	public double avg() {
		return sum() / 3.0;
	}

	@Override
	public String toString() {
		return String.format("%s:%d:%d:%d", name, math, ch, eng);

	}
}
