package Arraypractice;

import java.util.Iterator;
import java.util.Scanner;

public class arrayq4 {

	public static void main(String[] args) {
  //int[] a= {1,2,3,4,5};
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of the array");
  int n=sc.nextInt();
  System.out.println("Enter the element");
  int[]a=new int[n];
  for (int i = 0; i < a.length; i++) 
  {
	a[i]=sc.nextInt();
}
  
  int[] b=new int [a.length];
  for (int i = 0; i < a.length; i++)
  {
	b[i]=a[i];
}
  for (int i = 0; i < a.length; i++) 
  {
	System.out.println(a[i]+" ");
}
	System.out.println();
System.out.println("Coppy Array");
  for (int i = 0; i < b.length; i++) 
  {
	System.out.println(b[i]+" ");
}
  System.out.println();
}
}
