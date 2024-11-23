package ByRecursion;

public class MiximumElement {
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		int[] a= {12,3,2,34,55,5,67,7,8,67};
		print(a,0);
	}

	private static void print(int[] a, int i)
	{
		if(a[i]>max)
			max=a[i];
		if(i<a.length-1)
		{
			i++;
		print(a, i);
		}
		else
		{
			System.out.println(max);
//			System.out.println("diff "+(max-min));
		}
	}
	

}
