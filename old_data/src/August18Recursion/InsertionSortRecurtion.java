package August18Recursion;

import java.util.Arrays;

public class InsertionSortRecurtion {

	public static void main(String[] args) {
		int[]a= {5,6,3,2,1,4};
		print(a,1,1);
		System.out.println(Arrays.toString(a));

	}

	private static void print(int[] a, int i, int j) 
	{

		if(a[j-1]>a[j])
		{
			int temp=a[j];
			a[j]=a[j-1];
			a[j-1]=temp;
		}
		
		if(j >1)
			j--;
		else
		{
			i++;
			j = i;
		}
		if(i < a.length)
			print(a, i, j);
		
	}

}
