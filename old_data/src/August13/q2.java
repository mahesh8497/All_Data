package August13;import java.util.Arrays;

public class q2 {

	public static void main(String[] args) {
		int[] a= {0,2,3,0,5,6};
//		int sum=0;
//		for (int i = 0; i < a.length; i++) 
//		{
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
		
			sum(a,0,0);
			System.out.println(Arrays.toString(a));
		
	}

	private static void sum(int[] a, int i, int j) 
	{
		int sum=0;
		sum=sum+a[i];
		i++;
		if(i<a.length)
			sum(a,i,j);
	}

}
