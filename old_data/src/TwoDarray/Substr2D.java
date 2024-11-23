package TwoDarray;

import java.util.Scanner;

public class Substr2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int r=sc.nextInt();
		System.out.println("Enter the column");
		int c=sc.nextInt();
		int[][]a=new int[r][c];
		for (int i = 0; i < a.length; i++)
		{
		for (int j = 0; j < a[i].length; j++) 
		{
		a[i][j]=sc.nextInt();	
		}	
		}
		int[][]b=new int[r][c];
		for (int i = 0; i < b.length; i++)
		{
		for (int j = 0; j < b[i].length; j++)
		{
			b[i][j]=sc.nextInt();
		}	
		}
		System.out.println("substraction of two matrix");
		int[][]d=new int [r][c];
		for (int i = 0; i < a.length; i++) 
		{
		for (int j = 0; j < b.length; j++) 
		{
		d[i][j]=a[i][j]-b[i][j];	
		System.out.print(d[i][j]+" ");
		}	
		System.out.println();
		}
		
	}

}
