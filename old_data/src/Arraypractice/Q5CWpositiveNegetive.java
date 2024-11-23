package Arraypractice;
import java.util.Scanner;
public class Q5CWpositiveNegetive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Enter The size of array :");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("Enter the Element in Array");
for (int i=0;i<a.length;i++) {
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++)
{
	for (int j=0;j<a.length;j++) 
	{
		if(a[i]>0 && a[j]<0) 
		{
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
}
}
}
System.out.println("After Shifting Array =");
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]+" ");
}
}
}