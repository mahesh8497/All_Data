package Lect12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Launch {
public static void main(String[] args) {
	Predicate<Integer>isEven=x->x%2==0;
	List<Integer>numbers=Arrays.asList(1,2,3,4,5,6);
	for(Integer i:numbers) {
		if(isEven.test(i)) {
			System.out.println(i);
		}
	}
	
}
}
