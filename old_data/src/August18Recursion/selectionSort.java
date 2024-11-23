package August18Recursion;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		int[]a= {8,6,7,5,4,3,2,1};
		selection(a,0,1);
		System.out.println(Arrays.toString(a));

	}

	private static void selection(int[] a, int i, int j)
	{
		int max=i;
		if(a[j]>a[max])
		{
			max=j;
		}
		{
		int temp=a[i];
		a[i]=a[max];
		a[max]=temp;
		}
		if(j < a.length-1)
			j++;
		else
		{
			j=0;
			i++;
		}
		if(i < a.length)
			selection(a, i, j);
			
		
	}

}
