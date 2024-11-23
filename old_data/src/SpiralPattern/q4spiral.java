package SpiralPattern;

import java.util.Scanner;

public class q4spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
			int n=sc.nextInt();
			int[][]a=new int[n][n];
			int imax=a.length-1;
			int jmax=a.length-1;
			int imin=0;
			int jmin=0;
			int count=1;
			while(imin<=imax)
			{
				for(int j=jmin;j<jmax;j++)
				{
					a[imin][j]=count++;
				}
				for (int i =imin; i <imax; i++)
				{
				a[i][jmax]=count++;
				}
				for (int j =imax; j>imin; j--)
				{
					a[imax][j]=count++;
				}
				for (int i =imax; i >jmin; i--)
				{
				a[i][jmin]=count++;	
				}
				if(imin==imax&&jmin==jmax)
				{
					a[imin][imax]=count++;
				}
				imin++;
				jmin++;
				imax--;
				jmax--;
				}
				for (int i = 0; i < a.length; i++) 
				{
				for (int j = 0; j < a.length; j++)
				{
				System.out.print(a[i][j]+" ");	
				}	
				System.out.println();
				}
			}
	}


