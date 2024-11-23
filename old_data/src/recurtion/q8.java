package recurtion;

public class q8 {
//maximum number
	public static void main(String[] args) {
		int[] a= {9,7,5,12,6,2,4};
		int n=a.length;
		System.out.println(max(a,n));

	}
public static int max(int a[],int n) {
	if(n==1)
		return a[0];
	return Math.max(a[n-1], max(a,n-1));
}
}
