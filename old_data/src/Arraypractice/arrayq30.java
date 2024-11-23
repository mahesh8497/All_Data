package Arraypractice;

import java.util.Arrays;

public class arrayq30 {
//Remove the elements of 2nd array from 1st array (if found multiple, remove only two)
	//Ex: input array int[] a= {1,1,1,1,1,2,2,3,4}; elements to remove int[] n= {1,2,4};
	//expected output: {1,1,1,3}
	public static void main(String[] args) {
		int[] a= {1,1,1,1,1,2,2,3,4};
		int[] n= {1,2,4};
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			int count1=0;
			for (int j = 0; j < n.length; j++)
			{
				if(a[i]==n[j])
				{
					count1++;
					break;
				}
			}
			
			int count2=1;
			for (int j = 0; j < i; j++) 
			{
				if(a[i]==a[j])
					count2++;
			}
			if(count1==0)
				count++;//b[index++]=a[i]; for second loop
			if(count2>2)
				count++;//b[index++]=a[i]; for second loop
		}
		System.out.println(count);
		int b[]=new int [count];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			int count1=0;
			for (int j = 0; j < n.length; j++)
			{
				if(a[i]==n[j])
				{
					count1++;
					break;
				}
			}
			int count2=1;
			for (int j = 0; j <i; j++)
			{
				if(a[i]==a[j])
				{
					count2++;
				}
			}
			if(count1==0)
				b[index++]=a[i];
			if(count2>2)
				b[index++]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
