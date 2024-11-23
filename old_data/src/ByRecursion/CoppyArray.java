package ByRecursion;

import java.util.Arrays;

public class CoppyArray {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8};
		int[]b=new int[a.length];
		int index=0;
		print(a,b,0,index);
	}

	private static void print(int[] a, int[] b, int i, int index)
	{
		if(b[i]==a[i]);
		b[index++]=a[i];
		if(i < a.length-1)
		{
			i++;
		print(a, b, i, index);
		}
		else
		{
			System.out.println(Arrays.toString(b));
			System.out.println("Array coppy");
			System.out.println(Arrays.toString(a));

		}

		
	}

}
