package BasicProgram;

import java.util.Iterator;

public class prime2DArrayAddition {

	public static void main(String[] args) {
int[][] a= {{1,2,3,6},
		    {6,8,11,9},
		    {7,7,3,7},
		    {3,5,6,7}};

int sum=0;
double count=0;
for (int i = 0; i < a.length; i++) 
{
for (int j = 0; j < a[i].length; j++)
{
	if(i!=0 && j!=0 && i!=a.length-1 && j!=a[j].length-1)
	{
	boolean isprime=true;
	{
		int c=0;
		for (int k = 1; k < a.length-1; k++) 
		{
			if(a[i][j]%k==0)
			{
				c++;
			}
		}
		if(c<=1)
		{
			sum=sum+a[i][j];
			System.out.println(a[i][j]+" ");
			count++;
		}	
	}	
	}	
}
}
System.out.println(sum);
System.out.println(count);
System.out.println("Average of the inner element is= "+(sum/count));
	}
}
