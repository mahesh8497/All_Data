package August20;

public class q38 {

	public static void main(String[] args) {
		int[] a= {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		for (int i = 0; i < a.length; i++)
		{
		int count=0;
		for (int k = 0; k < i; k++) 
		{
		if(a[i]==a[k])
			count++;
		}
		if(count==0)
			for (int j = i+1; j < a.length; j++) 
			{
			int rank=0;
			for (int k = 0; k < j; k++)
			{
				if(a[j]==a[k])
					rank++;
			}
			if(rank==0)
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}

}
