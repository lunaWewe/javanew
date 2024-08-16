package tw.luna.pretty;

import java.util.HashMap;
import java.util.Set;

public class Luna32 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "Luna");
		map.put("age", 18);
		map.put("gender", true);
		map.put("weight", 80.1);

		System.out.println(map.get("age"));
		System.out.println("---");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.printf("%s => %s\n", key, map.get(key));
		}
		
		
	}

}
