package ByRecursion;

public class pattern {

	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++)
//		{
//		for (int j = 0; j < 5; j++)
//		{
//		if(i+j<5)
//			System.out.print("*");
//		else 
//			System.out.print(" ");
//		}
//		System.out.println();
//		}
		
		
		print(0,0);
	}

	private static void print(int i, int j) 
	{
		if(i+j<5)
			System.out.print("*");
			j++;
		if(j==5)
		{
			System.out.println();
			i++;
			j=0;
		}
		if(i<5)
			print(i, j);
		
	}

}
