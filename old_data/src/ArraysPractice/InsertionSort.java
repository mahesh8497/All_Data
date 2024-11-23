package ArraysPractice;

import java.util.Iterator;

public class InsertionSort {

	public static void main(String[] args) {
			int[] a= {6,2,3,5,2,4,7,5,4,1,2};
			for (int i = 0; i < a.length; i++) 
			{
				int start=0;//start with initial value
				int end=i;
				for (int j =i-1; j>=0; j--) //j start with i-1
				{
					if(a[j]<a[i])
					{
						start=j+1;
						break;
					}
				}
				int temp=a[end];//store the end value in temp variable
	            for (int j = end; j>start; j--) 
	            {
					a[j]=a[j-1];
				}			
	            a[start]=temp;//store the temp value in start
			}
			for (int i = 0; i < a.length; i++)
			{
			System.out.print(a[i]+" ");	
			}
			
			
	}

}
