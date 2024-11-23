package Arraypractice;

import java.util.Scanner;

public class cwq2array {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Given array is= ");
int[] a= {1,2,3,4,5,67,7};
for (int i = 0; i < a.length; i++)
{
System.out.print(a[i]+" ");	
}
Scanner sc=new Scanner(System.in);
System.out.println();
System.out.println("Check the element is present in array ");
System.out.println("Enter the element ");
int num=sc.nextInt();
boolean presentValue=false;
for (int i = 0; i < a.length; i++)
{
	if(a[i]==num)
		presentValue=true;
}
if(presentValue)
	System.out.println("Present In array");
else 
	System.out.println("Not Present ");
	}

}
