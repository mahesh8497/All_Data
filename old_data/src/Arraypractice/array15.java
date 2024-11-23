package Arraypractice;

import java.util.Iterator;

public class array15 {

	public static void main(String[] args) {
int[] a= {1,5,3,4,5,2,34,2,22};
for (int i = 0; i < a.length; i++) 
{
System.out.println(a[i]+" ");	
}
System.out.println();
System.out.println("Leader element");
for (int i = 0; i < a.length; i++)
{
	int count=0;
	for (int j = i+1; j < a.length; j++) 
	{
		if(a[j]>a[i])
			count++;
	}
	if(count==0)
		System.out.print(a[i]+" ");
}
	}

}
