package August5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class foreachloop {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(12);
		set.add(11);
		set.add(15);
		set.add(17);
		set.add(19);
		/*for(int a:set)
			System.out.println(a);
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(1);
		for(int a:list)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		int[] a= {1,2,3,4};
		for(int b:a)
		{
			System.out.println(b);
		}
		*/
		//Using second way
		
		
//		Object[] a = set.toArray();
//		for (Object p:a)
//		{
//			int c=(Integer)p;//we can also use int
//			System.out.println(c);
//		}
//		 
		
		//for Iterator 
		Iterator it=set.iterator();
		while(it.hasNext())//if next element present then true.... if not present return false
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
