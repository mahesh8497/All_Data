package ArraysPractice1;

import java.util.Iterator;

public class hw11 {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,1,2,3,4,5,6,7};
		int count=0;
		for (int i = 0; i < a.length; i++)
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
		System.out.println();
		int[] b=new int[a.length-count];//duplicate element remove
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
			{
				b[index++]=a[i];
			}
		}
			for (int i = 0; i < b.length; i++)
			{
				System.out.print(b[i]+" ");
			}
			

			}

		}