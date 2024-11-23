package Sept9ProblemonAssignMent;

import java.util.ArrayList;

public class q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(11);
		list.add(9);
		list.add(5);
		list.add(6);
		list.add(8);
		for (int i = 0; i <list.size(); i++) 
		{
		for (int j = 0; j <list.size(); j++) 
		{
		int tempi=list.get(i);
		int tempj=list.get(j);
		list.set(i, tempj);
		list.set(j, tempi);
		}	
		}
		System.out.println(list);


	}

}
