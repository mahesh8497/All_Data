package August5;

import java.util.ArrayList;
import java.util.LinkedList;

public class duplicatebyLinkedList {

	public static void main(String[] args) {
		//LinkedList<Integer> list=new LinkedList<Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		//list.add(3);
		//list.add(3);
		//list.add(3);
		for (int i = 0; i < list.size(); i++)
		{
			int rank=1;
			for (int j = 0; j <i; j++)
			{
				if(list.get(i)==list.get(j))
				{
					rank++;
				}
				if(rank>1)
				{
					list.remove(i);
					i--;
				}
			}
		}
		System.out.println(list);
	}}

//		for (int i = 0; i < list.size(); i++) 
//		{
//			int rank=1;
//			for (int j =0 ;j <i; j++) 
//			{
//				if(list.get(i) == list.get(j))
//				{
//					
//					rank++;
//				}
//				if(rank>1)
//				{
//					list.remove(i);
//					i--;
//				}
//			}
//		}
//		System.out.println(list+" ");

