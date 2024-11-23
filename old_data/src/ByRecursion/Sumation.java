package ByRecursion;

import java.util.Arrays;

public class Sumation {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int sum=SA(a,a.length);
		System.out.println("sumation "+sum);
	}

	private static int SA(int[] a, int length) 
	{
		if(length<=0)
		return 0;
		return(SA(a,length-1)+a[length-1]);
	}

}
