package TwoDarray;

import java.util.Scanner;

public class AdditionByUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size");
		int r=sc.nextInt();
		System.out.println("Enter column size");
		int c=sc.nextInt();
		int[][]a=new int[r][c];
		System.out.println("Element in array A");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int[][]b=new int [r][c];
		
		System.out.println("Enter in array B");
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b[i].length; j++) 
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition of two matrix");
		int[][]d=new int[r][c];
		for (int i = 0; i < d.length; i++) 
		{
		for (int j = 0; j < d[i].length; j++) 
		{
			d[i][j]=a[i][j]+b[i][j];
			System.out.print(d[i][j]+" ");
		}	
		System.out.println();
		}
		
	}

}
