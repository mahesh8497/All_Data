package Arraypractice;

import java.util.Arrays;
import java.util.Scanner;

public class arrayq3 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the array size");
//		int s=sc.nextInt();
//		System.out.println("Enter the element");
//		int[] a=new int[s];
//		for (int i = 0; i < a.length; i++) 
//		{
//			a[i]=sc.nextInt();
//		}
//		for (int i = 0; i < a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
//		System.out.println("Enter the remove element");
//		int n=sc.nextInt();
//		int count=0;
//		for (int i = 0; i < a.length; i++) {
//			
//			if(a[i]==n)
//			{
//				count++;
//			}
//		}
//		int[] b=new int[a.length-count];
//		int index=0;
//		int i=0;
//		int j=0;
//		while(i<a.length && j<a.length)
//		{
//			if(a[i]!=n)
//			{
//				b[j++]=a[i];
//			}
//			i++;
//		}
//		a=b;
//		System.out.println(Arrays.toString(a));

		int[]a= {1,2,3,4,5,6};
		int num=1;
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
		if(a[i]==num)
			count++;
		}
		int[]b=new int [a.length-count];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
		if(a[i]!=num)
		{

			b[index++]=a[i];
		}
		}
				
		System.out.println(Arrays.toString(b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
//first we create array is length is first array length - 1(1 because 1 element are remove)
//check the element in first array it is present or not 
//take count increase and storage the element index in b araay
