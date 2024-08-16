package tw.luna.pretty;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Luna28 {

	public static void main(String[] args) {
//		HashSet<Integer> set = new HashSet<Integer>();
//		set.add(12);
//		set.add(365);
		//set.add((byte)12); // byte 12 => int 12 => Integer(12)
		
		TreeSet<Integer> power = new TreeSet<Integer>();
		while (power.size()<6) {
			power.add(new Random().nextInt(1,39));
		}
		System.out.println(power);
		 System.out.println("-------");

		// 泛型
		Iterator<Integer> it = power.iterator();
		while (it.hasNext()) {
			Integer num = it.next();
			System.out.println(num);
		}
		
		System.out.println("-------");
		
		for (Integer v :power) {
			System.out.println(v);
		}
		
	}

}
