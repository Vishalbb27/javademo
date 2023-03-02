package mapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<>();
		marks.put("Bob", 99);
		marks.put("John", 60);
		marks.put("Max", 70);
		marks.put("Tom", 67);
		marks.put("Lee", 94);
		marks.put("Tom", 75);
		System.out.println(marks);
		System.out.println(marks.keySet());
		System.out.println(marks.values());
		
		for(String key:marks.keySet()) { //for each loop
			System.out.println(marks.get(key));
		}
		
		Map<String, Integer> marks1 = new LinkedHashMap<>();
		marks1.put("Bob", 99);
		marks1.put("John", 60);
		marks1.put("Max", 70);
		marks1.put("Tom", 67);
		marks1.put("Lee", 94);
		marks1.put("Tom", 75);
		marks1.put(null, 0);
		System.out.println(marks1);
	}
}
