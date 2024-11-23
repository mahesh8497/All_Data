package LinklistIterator;

import java.util.Iterator;
import java.util.LinkedList;

public class linklist 
{
   public static void main(String[] args) 
   {
	  LinkedList<Integer>list=new LinkedList<>();
	  list.add(11);
	  list.add(22);
	  list.add(33);
	  list.add(44);
	  Iterator it=list.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
   }
}
