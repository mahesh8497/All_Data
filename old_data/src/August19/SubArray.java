package August19;

public class SubArray {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,2,5,6,7,8,7,9,7,7,5,4};
		int k=3;
		int leastAvg=Integer.MAX_VALUE;
		int index=0;
		for (int i = 0; i < a.length-k+1; i++)
		{
			int sum=0;
		for (int j = i; j < i+k; j++) 
		{
			sum=sum+a[j];
		}	
		int avg=sum/k;
		if(avg<leastAvg)
		{
			leastAvg=avg;
			index=i;
		}
		}
		System.out.println("Least Average "+leastAvg);
		System.out.println("Index of least Average"+index);
		System.out.println("Given Element");
		for (int i = index; i < index+k; i++)
		{
		System.out.print(a[i]+" ");	
		}
	}

}
