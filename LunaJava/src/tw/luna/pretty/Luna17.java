package tw.luna.pretty;

import java.util.Random;

import tw.luna.apis.TWId;

public class Luna17 {

	public static void main(String[] args) {
//		System.out.println(TWId.isRight("A230784782"));
//		
//		Random random = new Random();
//		System.out.println(random.nextInt(2));
		
		TWId id1 = new TWId();
		TWId id2 = new TWId(false);
		TWId id3 = new TWId('B');
		TWId id4 = new TWId(true,'Y');
		TWId id5 = TWId.newTWId("A230784781");
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		System.out.println(id5.getId());
		
		
	}

}
