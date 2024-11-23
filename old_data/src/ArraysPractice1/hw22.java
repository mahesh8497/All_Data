package ArraysPractice1;

import java.util.Scanner;

public class hw22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element in row");
		int row=sc.nextInt();
		System.out.println("Enter the element in column");
		int column=sc.nextInt();
		int[][] a=new int[row][column];
		System.out.println("enter the element in array A");
		for (int i = 0; i < a.length; i++)
		{
		for (int j = 0; j < a[i].length; j++)
		{
		a[i][j]=sc.nextInt();	
		}	
		}
		for (int i = 0; i < a.length; i++)
		{ 
		for (int j = 0; j < a[i].length; j++)
		{
		System.out.print(a[i][j]+" ");	
		}	
		System.out.println();
		}
		int[][] b=new int[column][row];
		System.out.println("Enter the element in array B:");
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b[i].length; j++) 
			{
				b[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++) 
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After Multi");
	int[][] m=new int[a.length][a.length];
	for (int i = 0; i < m.length; i++)
	{
		for (int j = 0; j < b.length; j++)
		{
			for (int k = 0; k < b.length; k++) 
			{
				m[i][j]=m[i][j]+a[i][k]*b[k][j];
			}
			//System.out.println();
			System.out.print(m[i][j]+" ");
		}
		
		System.out.println();
	}
		}

	

}
