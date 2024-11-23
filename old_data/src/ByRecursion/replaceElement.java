package ByRecursion;

import java.util.Arrays;

public class replaceElement {

	public static void main(String[] args) {
		int[] a= {0,2,3,4,5,6};
		print(a,0);
	}

	private static void print(int[] a, int i) 
	{
		if(a[i]==0)
			a[i]=1;
		if(i<a.length)
			i++;
		System.out.println(Arrays.toString(a));

		
	}

}
