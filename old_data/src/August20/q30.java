package August20;

public class q30 {

	public static void main(String[] args) {
		int[] a= {1,1,1,2,2,3,4,4,4};
		int[] n= {1,4};
		for (int j = 0; j < n.length; j++)
		{
		int p=n[j];
		int pcount=0;
		for (int i = 0; i < a.length; i++) 
		{
		if(a[i]==p)
			pcount++;
		}
		int[]b=new int[a.length-pcount];
		int bindex=0;
		for (int i = 0; i < a.length; i++)
		{
		if(a[i]!=p)
			b[bindex++]=a[i];
		}
		a=b;
		}
		for (int i = 0; i < a.length; i++)
		{
		System.out.println(a[i]+" ");	
		}

	}

}
