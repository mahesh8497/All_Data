package Arraypractice;

import java.util.Iterator;

public class arrayq21 {

	public static void main(String[] args) {
int[][] a= {{1,2,3},{4,3,2},{5,4,3},{12,4,3}};
int[][] b= {{3,2,2},{5,4,6},{7,5,4},{9,6,5}};
int[][] c=new int[3][3];
System.out.println("Addition of two matrix");
for (int i = 0; i < c.length; i++)
{
	for (int j = 0; j < c.length; j++)
	{
		c[i][j]=a[i][j]+b[i][j];
	}
for (int j = 0; j < c.length; j++)
{
System.out.print(c[i][j]+" ");	
}
System.out.println();
}
}}