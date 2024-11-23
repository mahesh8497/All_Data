package Lect12;

import java.util.function.Predicate;

public class Pre_Methods {
public static void main(String[] args) {
	
	//And CONDITION
	
//	Predicate<String >startWithA=x->x.toLowerCase().charAt(0)=='a';
//	Predicate<String >endWithA=x->x.toLowerCase().charAt(x.length()-1)=='l';
//	Predicate<String>and =startWithA.and(endWithA);
//	System.out.println(and.test("atukq"));
//	
	
	
	//OR Condition
	
	
//	Predicate<String >startWithA=x->x.toLowerCase().charAt(0)=='a';
//	Predicate<String >endWithA=x->x.toLowerCase().charAt(x.length()-1)=='l';
//	Predicate<String> or=startWithA.or(endWithA);
//	System.out.println(or.test("amar"));
	
	
	
	//negate()
	
//	Predicate<String >startWithA=x->x.toLowerCase().charAt(0)=='a';
//	Predicate<String >endWithA=x->x.toLowerCase().charAt(x.length()-1)=='l';
//	System.out.println(startWithA.negate().test("mol"));
	
	
	//isEqual
	

	Predicate<String >startWithA=x->x.toLowerCase().charAt(0)=='a';
	Predicate<String >endWithA=x->x.toLowerCase().charAt(x.length()-1)=='l';
	Predicate<Object> predicate=Predicate.isEqual("Mahesh");
	System.out.println(predicate.test("ubhu"));
	
}
}
