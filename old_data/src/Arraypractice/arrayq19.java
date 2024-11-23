package Arraypractice;
import java.util.*;
public class arrayq19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int row,col;
	//	int a[][]=new int[row][10];
		System.out.println("enter number of rows in array ");
		row=sc.nextInt();
		System.out.println("enter number of colun in array ");
		col=sc.nextInt();
		System.out.println("enter array element "+(row*col));
		int a[][]=new int[row][col];

		for (int i = 0; i <row; i++)
		{
		for (int j = 0; j < col; j++)
		{
		a[i][j]=sc.nextInt();	
		}	
		}
		System.out.println("The array is ");
		for (int i = 0; i <row; i++) 
		{
		for (int j = 0; j <col; j++)
		{
			System.out.print(a[i][j]+" ");
		}	
		System.out.println();
		}
		
		

	}

}
