package ArraysPractice;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a= {6,4,2,7,3,2,1,5};
		for (int i = 0; i < a.length; i++) 
		{
			int minInd=i;
		for (int j = i+1; j < a.length; j++) 
		{
			if(a[j]<a[minInd])
				minInd=j;
		}
				int temp=a[i];
				a[i]=a[minInd];
				a[minInd]=temp;
				
		}
		System.out.println("after sorting");
		System.out.println(Arrays.toString(a));
		}	
		}
	
