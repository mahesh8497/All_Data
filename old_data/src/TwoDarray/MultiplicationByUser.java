
package TwoDarray;

import java.util.Scanner;

public class MultiplicationByUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row");
		int r=sc.nextInt();
		System.out.println("Enter the size of row");
		int c=sc.nextInt();
		int[][]a=new int [r][c];
		System.out.println("Enter the element");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				a[i][j]=sc.nextInt();
			}
	}
		System.out.println("Row Element");
		for (int i = 0; i < a.length; i++) 
		{
		for (int j = 0; j < a[i].length; j++)
		{
		System.out.println(a[i][j]+" ");	
		}	
		}
		int[][]b=new int[c][r];
		System.out.println();
		System.out.println("Column Element");
		for (int i = 0; i < b.length; i++)
		{
		for (int j = 0; j < b.length; j++)
		{
			b[i][j]=sc.nextInt();
		}	
		}
		System.out.println("Row Element");
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++)
			{
				System.out.println(b[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println("After multiplication");
		int[][] m=new int [a.length][b.length];
		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
			for (int k = 0; k < a.length; k++) 
			{
				m[i][j]=m[i][j]+a[i][k]+b[j][k];
				System.out.print(m[i][j]+" ");
				
			}	
			System.out.println();
			}
		}
}
}
