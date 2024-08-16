package tw.luna.pretty;

import java.util.LinkedList;
import java.util.List;

public class Luna30 {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("Luna");
		list.add(123);
		list.add(0, 12.3);
		list.add(true);
//		list.add(5, 123);  // 拿出再插入時裡面只有5個項目[0-4]
		list.add(123);  
		list.add("Luna");
		
		list.add(list.remove(3));
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("------");
		
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
