package August18Recursion;

import java.util.Arrays;

public class selectionSort1 {

	public static void main(String[] args) {
		int[]a= {8,6,7,5,4,3,2,1};
		selection(a,0,1);
		System.out.println(Arrays.toString(a));

	}

	private static void selection(int[] a, int i, int j)
	{
		int min=i;
		if(a[j]<a[min])
		{
			min=j;
		}
		{
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
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
