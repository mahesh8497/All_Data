package Arraypractice;

import java.util.Iterator;
//Write a program to display outer elements of a matrix
public class arrayq23 {

	public static void main(String[] args) {
		int[][] a= {{1,2,3,4,5,6},
				{4,3,1,3,4,5},
				{5,4,6,8,9,4},
				{5,3,5,7,8,3},
				{9,7,5,3,2,4},
				{7,5,3,2,1,6}};
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(i==0||j==0||i==a.length-1||j==a.length-1)
				{
					System.out.print(a[i][j]+" ");
					sum=sum+a[i][j];
				}
				else 
					System.out.print("  ");//Take two space because of two loops
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(sum+" is sumation of outer element");
		
		
	}

}
