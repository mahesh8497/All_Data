package ByRecursion;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
			rev(a,0);
			System.out.println(Arrays.toString(a));

	}

	private static void rev(int[] a, int i)
	{
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
		}	
		
	
	}

}
