package recurtion;

public class leader {
	static int count=0;
	
	public static void main(String[] args) {
		int[] a= {12,2,1,4,7,5,4};
		print(a,0,1);

	}

	private static void print(int[] a, int i, int j) 
	{
		if(a[j]>a[i])
			count++;
		if(j<a.length-1)
			j++;
		else
		{
			i++;
			//count++;
			j=i+1;
			if (count==0)
			{
				System.out.println(a[i]+" ");
			}
		}
		if(i<a.length)
			print(a, i, j);
		
	}

}
