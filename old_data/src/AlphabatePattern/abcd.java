package AlphabatePattern;

import java.util.HashMap;
import java.util.Map;

public class abcd {

	

	public static void main(String[] args) {

		Map<String ,Integer>map=new HashMap<>();
		
		map.put("abc", 10);
		map.put("xyz", 20);
		map.put("pqr", 30);
		map.put("mns", 40);
		map.put("opq", 50);
		
		System.out.println(map.size());
		
		System.out.println(map);

	}

}
