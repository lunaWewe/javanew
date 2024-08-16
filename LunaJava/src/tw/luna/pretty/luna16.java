package tw.luna.pretty;

import tw.luna.apis.Bike;

public class luna16 {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1.length());

		byte[] b1 = { 97, 98, 99, 100 };
		String s2 = new String(b1);
		System.out.println(s2.length());
		System.out.println(s2);

		Bike b2 = new Bike(); // Bike()
		System.out.println("----");
		// b2 回傳記憶體位置
		System.out.println(b2); // tw.luna.apis.Bike@512ddf17

		int c = 12;
		System.out.println(c);

		Object obj1 = new Object();
		// obj1 回傳記憶體位置
		System.out.println(obj1); // java.lang.Object@6fdb1f78

		String s3 = "Luna";
		System.out.println(s3);
		String s4 = "Luna";
		String s5 = new String("Luna");
		String s6 = new String("Luna");
		System.out.println(s3 == s4);  // true
		System.out.println(s3 == s5); // false
		System.out.println(s5 == s6); // false
		
		System.out.println(s3.equals(s4));  // true
		System.out.println("Brad".charAt(0));
	}
}
