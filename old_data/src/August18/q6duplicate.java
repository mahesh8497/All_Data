package August18;
import java.util.Arrays;
public class q6duplicate {

	public static void main(String[] args) {
		int[]a= {1,3,1,2,1};
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
		//System.out.println(c);
		int[]b=new int[a.length-c];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{ int rank=1;
			for (int j = 0; j < i; j++) 
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
	}

}
