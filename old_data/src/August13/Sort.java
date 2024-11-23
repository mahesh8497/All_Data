package August13;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[]a= {7,6,5,4,3,2,1};
		for (int i = 0; i < a.length; i++)
		{
		for (int j = i+1; j < a.length; j++)
		{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}	
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-1]+" max element");
		System.out.println(a[a.length-3]+" third max element");

		System.out.println(a[0]+"  first min element");
		print(a,0,0);

	}

	private static void print(int[] a, int i, int j) 
	{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		//if(j < a.length)
	}

}
