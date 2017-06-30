package selenium;

import java.util.ArrayList;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("pratap", 28);
		map.put("rank", 8);
		System.out.println(map.keySet());
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.containsKey("pratap"));
		System.out.println(map.isEmpty());
		System.out.println(map.remove("rank"));
		System.out.println(map);
		
		//array list
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		System.out.println(a);

	}

}
