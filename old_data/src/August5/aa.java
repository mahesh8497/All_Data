package August5;

import java.util.LinkedList;

public class aa {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer> ();
		list.add(11);
		list.add(12);
		list.add(14);
		list.add(17);
		list.add(1);
		for (int i = 0; i < list.size(); i++)
		{
		for (int j = i+1; j <list.size(); j++)
		{
		if	(list.get(i)>list.get(j))
		{
			Integer temp=list.get(i);//get ith element
			list.set(i, list.get(j));//set=put the value of given index
			list.set(j, temp);
		}
			
		}	
		}
		System.out.println(list);
	}

}
