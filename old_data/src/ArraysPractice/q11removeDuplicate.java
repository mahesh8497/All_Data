package ArraysPractice;

public class q11removeDuplicate {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,5,4,3,2,1,3,3,2,4,5,3,2};
		int c=0;
		for (int i = 0; i < a.length; i++)
		{
		for (int j = i+1; j < a.length; j++)
		{
			if(a[i]==a[j])
			{
				c++;
			break;
			}
		}
		}
		System.out.print("duplicate element is= "+c);
		System.out.println();
		int index=0;
		int[]b=new int [a.length-c];
		for (int i = 0; i < b.length; i++) 
		{	int rank=1;
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
