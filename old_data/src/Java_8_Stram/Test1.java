package Java_8_Stram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
	public static void main(String[] args) {
		//filter
//		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8);
//		List<Integer> filteredList = list.stream().filter(x->x%2==0).collect(Collectors.toList());
//		System.out.println(filteredList);//print even number
//		List<Integer> mappedList = filteredList.stream().map(x->x/2).collect(Collectors.toList());
//
//	   System.out.println(mappedList);//print divide the number by 2
	
		
		//map
//		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8);
//		List<Integer> filteredList = list.stream().filter(x->x%2==0).map(x->x/2)
		//.collect(Collectors.toList());
//	
//		System.out.println(filteredList);
		
		
		//Distinct
//		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,0,1,2);
//		List<Integer> filteredList = list.stream().filter(x->x%2==0).map(x->x/2)
		//.distinct().collect(Collectors.toList());
//
//		System.out.println(filteredList);
		
		
		//sorted default (ascending)
//		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,0,1,2);
//		List<Integer> filteredList = list.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted().collect(Collectors.toList());
//
//		System.out.println(filteredList);
		
		
		
		//descending order
//		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,0,1,2);
//		List<Integer> filteredList = list.stream()
//				.filter(x->x%2==0)
//				.map(x->x/2).distinct()
//				.sorted((a,b)->(b-a))
//				.collect(Collectors.toList());
//
//		System.out.println(filteredList);
		
		
		//limit
//		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,0,1,2);
//		List<Integer> filteredList = list.stream()
//				.filter(x->x%2==0)
//				.map(x->x/2).distinct()
//				.sorted((a,b)->(b-a))
//				.limit(3)
//				.collect(Collectors.toList());
//
//		System.out.println(filteredList);
		
		
		
		//skip
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,0,1,2);
		List<Integer> filteredList = list.stream()
				.filter(x->x%2==0)
				.map(x->x/2).distinct()
				.sorted((a,b)->(b-a))
				.limit(3)
				.skip(1)
				.collect(Collectors.toList());

		System.out.println(filteredList);
		
		//print 1 to 100 number 
		
		
//		List<Integer>collect=Stream.iterate(0,x->x+1)
//				.limit(101).skip(1)
//				.collect(Collectors.toList());
//		System.out.println(collect);
		
//		
		
		
		//operation on 1 to 100 number
		
		
//		List<Integer>collect=Stream.iterate(0,x->x+1)
//				.limit(101).skip(1)
//				.filter(x->x%2==0)
//				.map(x->x/10)
//				.distinct()
//				.sorted((a,b)->(b-a))
//				
//				//.skip(0)
//				.collect(Collectors.toList());
//		System.out.println(collect);
		
		
		//Iterator
		//max element max return optional hencewe add .get
//		Integer intger=Stream.iterate(0, x->x+1).limit(101)
		//.map(x->x/20).distinct().max((a,b)->a-b).get();
//		System.out.println(intger);
		
		
		//peek
//		Integer intger=Stream.iterate(0, x->x+1).limit(101).map(x->x/20).distinct().peek(System.out::println).max((a,b)->a-b).get();
//		System.out.println(intger);
		
		//count the element
		Long intger=Stream.iterate(0, x->x+1).limit(101).map(x->x/2).distinct().count();
		System.out.println(intger);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
