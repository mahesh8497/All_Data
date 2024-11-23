package ArraysPractice1;

public class cw7 {

	public static void main(String[] args) {
		int[]a= {1,1,2};
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
		for (int j =i+1; j < a.length; j++)
		{
		if(a[i]==a[j])
		{
			count++;
			break;
		}
		}	
		}
		System.out.println(count);
	System.out.println();
	int[]b=new int[a.length-count];
	int index=0;
	for (int i = 0; i < a.length; i++) 
	{
		int rank=1;
		for (int j =0; j <i; j++)
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
	System.out.println(b[i]+" ");	
	}
	System.out.println();
	for (int i = 0; i < b.length; i++)
	{
	for (int j = 0; j < b.length; j++)
	{
	System.out.println(b[i]+" "+b[j]);	
	}	
	}
	}

}
