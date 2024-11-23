package Arraypractice;

import java.util.Arrays;

public class cwq3arraySelectionSort {

	public static void main(String[] args) {
int[] a= {3,4,6,7,2,5,8,1};
System.out.println("Given Array is= ");
for (int i = 0; i < a.length; i++)
{
	System.out.print(a[i]+" ");
}
System.out.println();
System.out.println("after selection sort");
for (int i = 0; i < a.length; i++) 
{
	int minInd=i;
	for (int j =i+1; j < a.length; j++) 
	{
		if(a[j]<a[minInd])
			minInd=j;
	}
	int temp=a[i];
	a[i]=a[minInd];
	a[minInd]=temp;
}
System.out.println(Arrays.toString(a));
	}

}
