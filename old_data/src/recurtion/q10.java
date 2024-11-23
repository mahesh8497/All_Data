package recurtion;

public class q10 {
//Transpose Matrix
	public static void main(String[] args) {
		int[][] a= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		int[][]b= new int[a.length][a.length];
		transpose(a,0,0,b);
	}

	private static void transpose(int[][] a, int i, int j, int[][] b)
	{
		if(i<a.length && j<a.length)
		{
			b[i][j]=a[j][i];
			
			System.out.print(b[i][j]+" ");
			
		}
		
		
		if(j<a.length)
			j++;
		else
		{
			j=0;
			i++;
			System.out.println();
		}
		
		
		if(i<a.length)
			transpose(a, i, j, b);
		
		
		
	}
	}


