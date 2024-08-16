package tw.luna.pretty;

public class Luna18 {

	public static void main(String[] args) {
		Luna183 objLuna183 = new Luna183();
	
	}
}

class Luna181 {
	public Luna181() {
		System.out.println("Luna181()");
	}
}

class Luna182 extends Luna181{
	Luna182(){
		System.out.println("Luna182()");
	}
}

class Luna183 extends Luna182 {
	Luna183() {
		this(2);
		System.out.println("Luna183()");
	}
	Luna183(int a){
		this("");
		System.out.println("Luna183(int)");
	}
	Luna183(String a){
		// this();
		System.out.println("Luna183(String)");
	}
}

