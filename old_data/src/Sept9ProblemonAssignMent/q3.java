package Sept9ProblemonAssignMent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(11);
		list.add(1);
		list.add(15);
		list.add(17);
		list.add(18);
		list.add(19);
		
//		ListIterator<Integer> it=list.listIterator(list.size());
		Iterator<Integer> it=list.listIterator();

//		while(it.hasPrevious())
		while(it.hasNext())

		{
			System.out.println(it.next());
		}
	}

}
