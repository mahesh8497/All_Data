package August20;

public class saddlePoint {

	public static void main(String[] args) {
		int[][] a= {{8,3,1},{9,9,8},{2,4,5}};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
			boolean smallELEiNRow=true;
			int min=a[i][j];
			for (int k = 0; k < a.length; k++) 
			{
				if(a[i][k]<min)
				smallELEiNRow=false;
			}
			boolean LargeELEinColumn=true;
			int max=a[i][j];
			for (int k = 0; k < a.length; k++)
			{
				if(a[k][j]>max)
				LargeELEinColumn=false;
				
			}
			if(smallELEiNRow==true && LargeELEinColumn==true )	
			{
			System.out.println(a[i][j]+ " is saddle point");	
			}

			
			}}
			}

		}
