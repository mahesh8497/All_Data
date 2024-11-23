package recurtion;

public class q1 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		
	int sum=sumarray(a,a.length);
	System.out.println("sum of element in present array "+sum);
	}

	private static int sumarray(int[] a, int n) 
	{
		if(n<=0)
			return 0;
		
		
		return (sumarray(a, n-1)+ a[n-1]);
	}
}
