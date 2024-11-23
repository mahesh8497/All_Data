package Arraypractice;

import java.util.Arrays;

public class arrayq18 {
//first even and then odd
	public static void main(String[] args) {
int[] a= {1,2,3,4,5,6,7,9,11,12,14};
System.out.println("Original array");
for (int i = 0; i < a.length; i++)
{
	System.out.print(a[i]+" ");
}
for (int i = 0; i < a.length; i++) 
{
for (int j = 0; j < a.length; j++) 
{
	if(i<j && a[i]%2!=0 && a[j]%2==0)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}	
}
System.out.println();
System.out.println("first even and then odd");
for (int i = 0; i < a.length; i++) 
{
	System.out.print(a[i]+" ");
}
//		for (int i = 0; i < a.length; i++)
//		{
//		for (int j = 0; j < a.length; j++)
//		{
//			if(i<j&&a[i]%2!=0 && a[j]%2==0)
//			{
//				int temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(a));
//		}
	}

}
