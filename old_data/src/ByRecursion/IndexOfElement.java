package ByRecursion;

public class IndexOfElement {
	 static int m=4;
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		// static int m=4;
		print(a,0);
	}

	private static void print(int[] a, int i) 
	{
		if(a[i]==m)
			System.out.println("present at index "+i);
		if(i < a.length-1)
		{
			i++;
			print(a, i);
		}
	}

}
