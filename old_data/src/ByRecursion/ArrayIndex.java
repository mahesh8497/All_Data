package ByRecursion;

public class ArrayIndex {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		print(0,a.length,a);
	}

	private static void print(int i, int length, int[] a)
	{
		System.out.println(a[i]+" "+i);
		i++;
		if(i<a.length)
			print(i,length,a);
	}

}
