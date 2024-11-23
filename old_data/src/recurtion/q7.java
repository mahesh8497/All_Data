package recurtion;

public class q7 {
//Minimum number
	public static void main(String[] args) {
		int[] a= {9,7,5,4,6,2,4};
		int n=a.length;
		System.out.println(min(a,n));
	}
public static int min(int a[],int n) {
	if(n==1)
		return a[0];
	return Math.min(a[n-1], min(a,n-1));
}
}
