package Arraypractice;

public class arrayq36 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,8};
		int n=8;
		int m=1;
		int minDist=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i]==n&& a[j]==m )
				{
					int dist=0;
					if(i<j)
						dist=j-i;
					
					else 
						dist=i-j;
					if(dist<minDist)
						minDist=dist;
				}
			}
		}
		System.out.println(minDist);
	}

}

	

/*int[]a= {1,2,3,1,5,7,8};
	int n=1;
	int m=8;
	int min=Integer.MAX_VALUE;
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]==n)
			for (int j = 0; j < a.length; j++)
			{
				if(a[j]==m)
				{
					int dist=0;
					if(j>i)
						dist=i-j;
					if(dist<min)
					{
						min=dist;
					}
				}
			}
	}
		System.out.println(min);
		
	}
}
	*/	
