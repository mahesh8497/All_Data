package SpiralPattern;

public class q1antiClockwise {
//shift or anticlockwise
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3,4},
					{5,6,7,8},
					{9,0,1,2},
					{3,4,5,6}};
		int n=0;
		while(n<1)//for three times rotate ,if you want one time then n=1
		{
			int imax=a.length-1;
			int jmax=a.length-1;
			int imin=0;
			int jmin=0;
		while(imin<imax)
		{
			int temp=a[imin][jmin];
			for (int j =jmin; j <jmax; j++)
			{
				a[imin][j]=a[imin][j+1];
			}
			for (int i =imin ; i <imax; i++) 
			{
			a[i][jmax]=a[i+1][jmax];	
			}
			for (int j =jmax; j>jmin; j--)
			{
			a[imax][j]=a[imax][j-1];	
			}
			for (int i =imax; i >imin; i--)
			{
			a[i][jmin]=a[i-1][jmin];	
			}
			imin++;
			a[imin][jmin]=temp;
			jmin++;
			imax--;jmax--;	
		}
		n++;
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]+" ");
		}
			System.out.println();
		}
	}

}
