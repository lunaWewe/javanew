package tw.luna.pretty;

import java.util.LinkedHashSet;

public class Luna29 {

	public static void main(String[] args) {

		// 去除相同的內容
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		System.out.println(names.add("Luna"));
		System.out.println(names.add("Eric"));
		System.out.println(names.add("Eric"));
		System.out.println(names.add("Rogers"));
		System.out.println(names.add("Rogers"));
		System.out.println(names.add("Mark"));
		System.out.println(names.add("Mark"));
		System.out.println(names.add("Tony"));

		for (String name : names) {
			System.out.println(name);
		}
	}

}
