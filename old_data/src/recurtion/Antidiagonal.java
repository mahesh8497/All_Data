package recurtion;

public class Antidiagonal {
//antidiagonal 
	public static void main(String[] args) {
		int[][]a= {{1,2,3},
				   {4,5,6},
				   {7,8,9}};
		
		antiDiagonalElem(a,0,0);
	}

	private static void antiDiagonalElem(int[][] a, int i, int j) 
	{
	if(j-i!=0 && j+i!=2)
		System.out.print(a[i][j]+" ");
	else
		System.out.print("  ");
	if(j<a.length-1)
		j++;
	else
	{
		j=0;
	i++;
	System.out.println();
	}
	if(i<a.length)
		antiDiagonalElem(a, i, j);
	}

}
