package recurtion;

import java.util.Arrays;

public class firstPositive {

	public static void main(String[] args) {
		int[]a= {6,5,4,-3,2-7,3,9,1,2,43};
		/*
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
			if(a[i]>0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		System.out.println(Arrays.toString(a));
*/
		print(a,0,1);
		System.out.println(Arrays.toString(a));
	}

	private static void print(int[] a, int i, int j) 
	{
		if(a[i]<0)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		if(j<a.length-1)
			j++;
		else
		{
			j = i+1;
			 i++;
		}
		if( i < a.length)
			print(a, i, j);
	}

}
