package tw.luna.pretty;

import java.util.HashSet;

import tw.luna.apis.Bike;

public class Luna27 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("Luna");
		set.add(12);  // 12 => new Integer(12) auto-boxing
		set.add(12.3);
		set.add("Luna");
		set.add(new Bike());
		set.add(12);
		System.out.println(set.size());
		System.out.println(set);
	}

}
