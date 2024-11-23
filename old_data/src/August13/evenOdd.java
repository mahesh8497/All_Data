package August13;

import java.util.Arrays;

public class evenOdd {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8};
//		for (int i = 0; i < a.length; i++)
//		{
//			for (int j =0; j < a.length; j++) 
//			{
//			if(i<j && a[i]%2==0 && a[j]%2!=0)
//			{
//				int temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//			}
//		}
//		System.out.println(Arrays.toString(a));
	
		
		print(a,0,1);
	}

	private static void print(int[] a, int i, int j)
	{
		if( a[i]%2==0 && a[j]%2!=0)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		if( j < a.length-1)
			j++;
		else
		{
			j=i+1;
			i++;	
		}
		if(i<a.length-1)
			print(a, i, j);
		else
		{
			System.out.println(Arrays.toString(a));

		}
	}

}
