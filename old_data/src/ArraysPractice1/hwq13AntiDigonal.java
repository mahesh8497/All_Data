package ArraysPractice1;

public class hwq13AntiDigonal {
	/*

	void diagonal(int A[][])
	{

		int n = 3;

		// For each column start row is 0
		for (int i = 0; i < n; i++) 
		{

			int startcol = i;
			int startrow = 0;

			while (startcol >= 0 && startrow < N)
			{

		System.out.print(A[startrow][startcol]+ " ");
				startcol--;
				startrow++;
			}
			System.out.println();
		}

		// For each row start column is N-1
		for (int j = 1; j < n; j++) 
		{
			int startrow = j;
			int startcol = n-1;

			while (startrow <n && startcol >= 0) 
			{
		System.out.print(A[startrow][startcol]+ " ");
				startcol--;
				startrow++;
			}
			System.out.println();
		}
	}

	// Driver code
	public static void main(String args[])
	{

		// matrix initialisation
		int A[][]
			= { { 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } };

		hwq13AntiDigonal m = new hwq13AntiDigonal();

		m.diagonal(A);
	}
}
*/
	public static void main(String[] args)
	{
		int[][]a= {{1,2,3},{7,5,5},{9,7,9}};
		for (int i = 0; i < a.length; i++)
		{
		for (int j = 0; j < a.length; j++)
		{
		if(j-i!=0 && j+i!=2)
			System.out.print(a[i][j]+" ");
		else
			System.out.print(" ");
		}
		System.out.println();
		}
	}


	}


