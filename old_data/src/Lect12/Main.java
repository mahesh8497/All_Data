package Lect12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
public static void main(String[] args) {
	List<Integer>num=Arrays.asList(1,2,3,4,5,6,7,8,9,0,43,23);
	int sum=num.stream().filter(n->n%2==0).mapToInt(n->n).sum();
	System.out.println(sum);
	
	
}
}
