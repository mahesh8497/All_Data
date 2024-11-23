package BasicProgram;

public class spiral {

	public static void main(String[] args) {
			int n=5;
			int [][]a=new int[n][n];
			int imin=0;
			int jmin=0;
			int imax=a.length-1;
			int jmax=a.length-1;
			//int c=1;
			int c=n-3;
			while(imin<=imax)
			{
				for (int j = jmin; j <=jmax; j++)
				{
					a[imin][j]=c;//c++
				}
				imin++;
				for (int i = imin; i <= imax; i++)
				{
					a[i][jmax]=c;//c++
				}
				jmax--;
				for (int j = jmax; j >=jmin; j--)
				{
					a[imax][j]=c;//c++
				}
				imax--;
				for (int i = imax; i >= imin; i--)
				{
					a[i][jmin]=c;//c++
				}
				jmin++;
				c--;
				
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
