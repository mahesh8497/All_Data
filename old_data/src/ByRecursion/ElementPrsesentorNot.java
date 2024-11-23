package ByRecursion;

public class ElementPrsesentorNot {
	static int n=1;
	static boolean present=false;
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6,7,8,9};
		print(a,0);
		
	}
	private static void print(int[] a, int i) 
	{
		//boolean present=false;

		if(a[i]==n)
			present=true;
		if(i < a.length-1)
		{
			i++;
			print(a, i);
		}
		else
		{
			if(present)
				System.out.println("present");
			else
				System.out.println("not present");
		}
	}

}
