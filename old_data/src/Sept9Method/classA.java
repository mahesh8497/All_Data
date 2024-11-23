package Sept9Method;

import java.util.ArrayList;

public class classA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<>();
		list.add(11);
		list.add(1);
		list.add(16);
		list.add(18);
		list.add(14);
		list.add(17);
		list.add(19);
		
		System.out.println(list.indexOf(19));
		System.out.println(list.toString());
		System.out.println(list.hashCode());
		System.out.println(list.get(3));
		System.out.println(list.contains(100)+" check the element");
		System.out.println(list+" original list");
		list.add(2, 28);
		System.out.println(list.clone()+" clone method");
		//list.clear();

	}

}
