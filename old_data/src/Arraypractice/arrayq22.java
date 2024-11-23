package Arraypractice;

import java.util.Scanner;

public class arrayq22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size in row");
		int r=sc.nextInt();
		System.out.println("enter the size column");
		int c=sc.nextInt();
		int[][]a=new int[r][c];
		System.out.println("enter the element");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		int[][]b=new int[c][r];
		for (int i = 0; i < b.length; i++) 
		{
		for (int j = 0; j < b.length; j++)
		{
		b[i][j]=sc.nextInt();	
		}	
		}
		
//		int[][]a= {{1,2,3},{5,4,3},{7,6,5}};
//		int[][]b= {{8,5,4},{9,3,7},{1,3,2}};
		int[][]m=new int[a.length][b.length];
		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
			for (int k = 0; k < b.length; k++) 
			{
				m[i][j]=m[i][j]+a[i][k]*b[k][j];
			}
			System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}

}
//After Multi
//29 20 24 
//79 46 54 
//115 68 80 

