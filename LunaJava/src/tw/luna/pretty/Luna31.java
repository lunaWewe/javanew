package tw.luna.pretty;

import java.util.LinkedList;
import java.util.List;

public class Luna31 {

	public static void main(String[] args) {
		List<String> times = new LinkedList<String>();
		times.add(0,"Luna");
		times.add(0,"10:20:30");
		times.add(0,"10:20:34");
		times.add(0,"10:20:37");
		times.add(0,"10:20:47");
		times.add(0,"10:20:51");
		times.add(0,"10:20:59");
		System.out.println("------");
		
		System.out.println(times);
		
		System.out.println("------");
		
		for (String time : times) {
			System.out.println(time);
		}
	}

}
