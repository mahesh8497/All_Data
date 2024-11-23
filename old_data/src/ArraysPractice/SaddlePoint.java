package ArraysPractice;
import java.util.*;
public class SaddlePoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,col;
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
			for (int i = 0; i < a.length; i++) 
			{
				int min=Integer.MAX_VALUE;
				boolean SaddlePoint=false;
				int index=0;
				for (int j = 0; j < a.length; j++)
				{
				if(a[i][j]<min)
				{
					min=a[i][j];
					index=j;
				}
				}
				int max=Integer.MIN_VALUE;
				for (int j = 0; j < a.length; j++)
				{
				if(a[j][index]>max)
				{
					max=a[j][index];
				}
				}
				if(min==max)
					SaddlePoint=true;
				if(SaddlePoint)
				{
					System.out.println(min);
					System.exit(0);
				}
				
				else if(i==a.length-1 )
					System.out.println(" saddle point not present");
					
			}
			
		}
		}