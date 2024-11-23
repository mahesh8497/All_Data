package August5;

import java.util.LinkedHashSet;

public class duplicateremove {

	public static void main(String[] args) {
		int[] a= {1,1,1,1,1,2,2,2,3,3,3};
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		for(int m:a)
		set.add(m);
		System.out.println(set);
	}

}
