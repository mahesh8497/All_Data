package Arraypractice;

import java.util.Iterator;
//Write a program to test the equality of two arrays 
public class arrayq14 {

	public static void main(String[] args) {
int[] a= {1,2,3,4,5};
int[] b= {1,2,3,4,5};
		if(b.length>a.length ||a.length>b.length)
			System.out.println("not same");
		if(a.length==b.length)
		{
			int diffelecount=0;
			for (int i = 0; i < b.length; i++)
			{
				if(a[i]!=b[i])
				{
					diffelecount++;
				}
			}
			System.out.println("The different element in array is "+diffelecount);
		if(diffelecount==0)
			System.out.println("Array is Same");
		else 
		System.out.println("Hence array is not same");	
		}
	
			

	}

}
//first check the length of the two array 
//take counter because count different element
//take for loop
//if a[]!=b[] count++
//syso diff element
//if diffelecount==0 then array is same
