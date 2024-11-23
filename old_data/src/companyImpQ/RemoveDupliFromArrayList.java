package companyImpQ;
import java.util.*;
public class RemoveDupliFromArrayList {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer>lh=new ArrayList<>();
//		lh.add(12);
//		lh.add(21);
//		lh.add(43);
//		lh.add(21);
//		lh.add(12);
//		Set<Integer>s=new LinkedHashSet<Integer>(lh);
//		System.out.println(s);
//		
		HashSet<Integer>set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		int sum=0;
		for(int i: set)
		{
			sum+=i;
			if(set.contains(sum))
				return 1;
			set.add(sum);
		}
		return sum;
		
		
		
		
		
		
		
		
//		for (int i = 0; i <lh.size(); i++)
//		{
//		for (int j = i+1; j <lh.size(); j++)
//		{
//		if(lh.get(i)==lh.get(j))
//		{
//			lh.remove(j);
//			i--;
//			break;
//		}
//		}	
//		}
//		System.out.println(lh);

	}

}



