package Arraypractice;

import java.util.Iterator;

public class cwq1array {

	public static void main(String[] args) {
int[] a= {1,2,3,4,5,6,7,8,9};
System.out.println("Given array is ");
for (int i = 0; i < a.length; i++)
{
	System.out.print(a[i]+" ");
}
System.out.println();
System.out.println("Total of array is");
int sum=0;
for (int i = 0; i < a.length; i++) 
{
	sum=sum+a[i];
}
System.out.print(sum);

	}

}
