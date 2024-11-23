package SpiralPattern;

public class q2 {

	public static void main(String[] args) {
		int n=5;
		int[][]a=new int[n][n];
		int counter=1;
		for (int i=0; i <2*n-1; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
			for (int k = 0; k < a.length; k++) 
			{
			if(k+j==i)
				a[j][k]=counter++;
			}	
			}
			
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]+" ");
		}
			System.out.println();
		// TODO Auto-generated method stub

	}

}
} 
