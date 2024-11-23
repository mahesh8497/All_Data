package Arraypractice;

public class arrayq37 {
//Write a program to find all the unique triplets such that sum of all the three elements is equal to a specified 
//	number
	public static void main(String[] args) {
	
		int[]a= {1,5,5,9,3,2,7,12,5,-7,3,2,0,-4};
		int count=0;
		for (int i = 0; i < a.length; i++)//duplicate count
		{
		for (int j = i+1; j < a.length; j++) 
		{
			if(a[i]==a[j])
			{
				count++;
				break;
			}
		}	
		}
		System.out.println(count);
		System.out.println("Target is 2");
		int[] b=new int [a.length-count];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			int rank=1;
			for (int j = 0; j < i; j++) 
			{
				if(a[i]==a[j])
					rank++;	
			}
			if(rank==1)
				b[index++]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{	}
		System.out.println();
		int sum=2;
		int counter=0;
		for (int i = 0; i < b.length; i++) 
		{
		for (int j = i+1; j < b.length; j++) 
		{
		for (int k = j+1; k < b.length; k++)
		{
			if(b[i]+b[j]+b[k]==sum)
			{
				System.out.println(b[i]+" "+b[j]+" "+b[k]);
				counter++;
			}
		}	
		}	
		}
		System.out.println("pair "+counter);
	}
}
