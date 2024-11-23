package july30MyHashMap;

import java.util.HashMap;

public class Myclass {

	public static void main(String[] args) {
		MyHashMap map=new MyHashMap();
		map.put(24, "one");
		map.put(2, "two");
		map.put(15, "of");
		map.put(27, "te");
		map.put(26, "te");
		map.print();
		//System.out.println(map.get(12));
		HashMap<Integer,String> map1=new HashMap<>();
		map1.put(24, "one");
		map1.put(2, "two");
		map1.put(15, "of");
		map1.put(27, "te");
		map1.put(26, "te");
		System.out.println(map1);
	}

}
