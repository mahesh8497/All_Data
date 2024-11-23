package SpiralPattern;
public class q3circlePattern {
	public static void main(String[] args) 
	{
	int n=7;
		int a[][]=new int[n][n];
		int imin=0,jmin=0;
				int imax=a.length-1;
				int jmax=a.length-1;
		int count=n;
		if(n%2==0)
			count=n/2;
		else
			count=n/2+1;//count=n/2
		while(imin<=imax)
		{
			for (int j =jmin; j <=jmax; j++)
			{
			a[imin][j]=count;	
			}
			for (int i =imin; i <=imax; i++)
			{
			a[i][jmax]=count;	
			}
			for (int j =jmax; j >jmin; j--) 
			{
			a[imax][j]=count;	
			}
			for (int i =imax; i>imin; i--) 
			{
				a[i][jmin]=count;
			}
			imax--;
			jmax--;
			imin++;
			jmin++;
			count--;
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
