package August19p;

public class SubArray {

	public static void main(String[] args) {
		/*
		int[]a= {6,2,3,4,9,8,7,6,5};
		int k=2;
		int index=0;
		int LeastAvg=Integer.MAX_VALUE;
		for (int i = 0; i < a.length-k+1; i++) 
		{
			int sum=0;
			for (int j = i; j < i+k; j++)
			{
			sum=sum+a[j];	
			}
			int avg=sum/k;
			if(avg<LeastAvg)
			{
			LeastAvg=avg;
			index=i;
			}
		}
		System.out.println("leastAverage "+LeastAvg);
		System.out.println("Index of least Average "+index);
		System.out.println("Given Element");
		for (int i = index; i < index+k; i++)
		{
		System.out.print(a[i]+" ");	
		}
	
	}

}
*/
	int[]a=  {6,2,3,4,9,8,7,6,5};
	int k=3;
	int index=0;
	int leastaveg=Integer.MAX_VALUE;
	for (int i = 0; i < a.length-k+1; i++) 
	{
		int sum=0;
		for (int j = i; j <i+k; j++) 
		{
			sum=sum+a[i];
		}
		int avg=sum/k;
		if(avg<leastaveg)
		{
			leastaveg=avg;
					index=i;
		}
	}
		
		
	System.out.println("leastAverage "+leastaveg);
	System.out.println("Index of least Average "+index);
	System.out.println("Given Element");
	for (int i = index; i < index+k; i++)
	{
	System.out.print(a[i]+" ");	
	}
		
		
		
		
		
		
		
	}
}
