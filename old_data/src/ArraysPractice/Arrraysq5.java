package ArraysPractice;

import java.util.Arrays;

//Write a program to find and display reverse of an array using third variable
public class Arrraysq5 {
	public static void main(String[] args)
	{
		int[]a= {1,2,3,4,5,6,7,8};
		System.out.println("given Array");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(Arrays.toString(a));
			break;
		}
		int i=0,j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
		}
		System.out.println();
		for (int j2 = 0; j2 < a.length; j2++) 
		{
		System.out.println(a[j2]+" ");	
		}
	}

}
