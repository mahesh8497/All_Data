package Arraypractice;

import java.util.Arrays;

public class arrayq38 {

	public static void main(String[] args) {
		int[] a= {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		int count=0;
		int sum=7;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j]) 
				{
				count++;
				break;
			}}
		}
		System.out.println(count+" this is count ");
		int[] b=new int[a.length-count];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			int rank=1;
			for (int j = 0; j <i; j++) 
			{
				if(a[i]==a[j])
					rank++;
			}
			if(rank==1)
				b[index++]=a[i];
		}
		a=b;
		System.out.println(Arrays.toString(b));

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(b[i]+b[j]==sum)
				System.out.println(a[i]+" "+a[j]+" ");
			}
		}
		
				}

}
