package Lect12;

import java.util.function.Predicate;

public class Pre_La {
	public static void main(String[] args) {
		Predicate<String >strtwithV=x->x.toLowerCase().charAt(0)=='v';
		System.out.println(strtwithV.test("Vishal"));
	}

}
