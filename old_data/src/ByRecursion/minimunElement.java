package ByRecursion;

public class minimunElement {
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		print(a,0);
	}

	private static void print(int[] a, int i) 
	{
		if(a[i]<min)
			min=a[i];
		if(i<a.length-1)
		{
			i++;
		print(a, i);
		}
		else
			System.out.println(min);
	}

}
