package july30TreeMap;

public class Myclass {

	public static void main(String[] args) {
		MyTreeMap map= new MyTreeMap();
		map.put(1, "India");
		map.put(3, "UK");
		map.put(4, "Nepal");
		map.put(2, "US");
		map.print();
		System.out.println(map.get(5));
		
		
	}

}
