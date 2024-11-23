package Arraypractice;
import java.util.Iterator;
import java.util.Scanner;
public class arrayq5 {
	public static void main(String[] args) {

		/*Scanner sc=new Scanner(System.in);
System.out.println("Enter Array size");
int n=sc.nextInt();
System.out.println("Enter the array element");
int[] a=new int[n];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]+ " ");
		}
int i=0,j=a.length-1;
while(i<j)
{
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	i++;j--;
}
System.out.println("Given Array is reverse array");
for (int k = 0; k < a.length; k++)
{
	System.out.println(a[k]+" ");
}
*/
		
		
		//Reverse Array
		int[] a= {1,2,3,4,5,6,7,8};
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.print(a[i]+" ");
//		}
//		int i=0,j=a.length-1;
//		while(i<j)
//		{
//			int temp=a[i];
//			a[i]=a[j];
//			a[j]=temp;
//			i++;j--;
//		}
//		System.out.println();
//		for (int j2 = 0; j2 < a.length; j2++) 
//		{
//		System.out.print(a[j2]+" ");	
//		}
		
		int[]b=new int[a.length];
		int i=a.length-1;
		int j=0;
		while(i>=0)
		{
			b[j]=a[i];
			i--;j++;
		}
		a=b;
		for (int k = 0; k < b.length; k++) {
			System.out.print(a[k]+" ");
		}
	}

}
