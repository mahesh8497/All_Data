package ArraysPractice;

public class q13Antidiagonal {

	//public static void main(String[] args) {
//		int[][]a= {{1,2,3,7},{7,6,5,5},{9,8,7,9},{1,2,3,4}};
//		for (int i = 0; i < a.length; i++)
//		{
//		for (int j = 0; j < a.length; j++)
//		{
//		//if(j-i!=0 && j+i!=2)
//			System.out.print(a[i][j]+" ");
//		//else
//			//System.out.print(" ");
//		}
//		System.out.println();
//		}
//	}
//
//}
		// Java implementation to return
		// an array of its anti-diagonals
		// when an N*N square matrix is given

	//	class Matrix {

			// function to print the diagonals
			void diagonal(int A[][])
			{

				int N = 3;

				// For each column start row is 0
				for (int i = 0; i < N; i++) 
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
				for (int j = 1; j < N; j++) 
				{
					int startrow = j;
					int startcol = N - 1;

					while (startrow < N && startcol >= 0) 
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

				q13Antidiagonal m = new q13Antidiagonal();

				m.diagonal(A);
			}
		}

