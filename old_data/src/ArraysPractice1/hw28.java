package ArraysPractice1;

public class hw28 {

	public static void main(String[] args) {
		int[][] a= {{8,3,1},{9,9,8},{2,4,5}};
		for (int i = 0; i < a.length; i++)
		{
		for (int j = 0; j < a.length; j++) 
		{
			boolean smallInRow=true;
			int min=a[i][j];
			for (int k = 0; k < a.length; k++)
			{
				if(a[i][k]<min)
					smallInRow=false;
			}
			boolean LargIncolumn=true;
			int max=a[i][j];
			for (int k = 0; k < a.length; k++)
			{
				if(a[k][j]>max)
					LargIncolumn=false;
			}
			if(smallInRow=true && LargIncolumn==true )
				System.out.println(a[i][j]+" sadal point");
		}	
		}
	}

}
