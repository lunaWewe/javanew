package tw.luna.pretty;

import java.util.Iterator;

public class array07 {

	public static void main(String[] args) {
		int[] ary1 = new int[3];
//		byte [] ary1=new byte[3];
//		short [] ary1=new short[3];
//		long [] ary1=new long[3];
//		float [] ary1=new float[3];
//		double [] ary1=new double[3];
//		char [] ary1=new char[3];

//		boolean [] ary1;
//		ary1 = new boolean[3]; 
		System.out.println(ary1[0]);
		System.out.println(ary1[1]);
		System.out.println(ary1[2]);
		System.out.println(ary1.length);
		System.out.println("-----");
		ary1[1] = 100;
		ary1[2] = 123;
//		ary1[3000] = 144;  // 只要是整數編譯都可過關
		for (int i = 0; i < ary1.length; i++) {
			System.out.println(ary1[i]);
		}
		System.out.println("----");
		for (int v : ary1 ) {
			System.out.println(v);
		}
	}

}
