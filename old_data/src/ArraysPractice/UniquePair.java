package ArraysPractice;

public class UniquePair {

	public static void main(String[] args) {
		int[] a= {1,1,1,2,2,2,2};
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
	int index=0;
	int[] b=new int[a.length-count];
	for (int i = 0; i < a.length; i++)
	{
		int rank=1;
		for (int j = 0; j < i; j++)
		{
			if(a[i]==a[j])
				rank++;
		}
		if (rank==1)
		{
			b[index++]=a[i];
		}
	}	
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
		}	
		System.out.println();			// System.out.println();
			System.out.println("pair element is");
			//enter duplicate remove code
			for (int i = 0; i < b.length; i++)
			{
				for (int j = 0; j < b.length; j++) 
				{
					System.out.println(b[i]+" "+b[j]);
				}
			}
			}

		}
