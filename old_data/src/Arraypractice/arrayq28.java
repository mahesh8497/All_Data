package Arraypractice;

public class arrayq28 {
//saddle point of a matrix
	public static void main(String[] args) {
		int[][] a= {{6,3,1},{9,7,8},{2,4,5}};
//for (int i = 0; i < a.length; i++) 
//{
//	for (int j = 0; j < a.length; j++)
//	{
//	boolean smallELEiNRow=true;
//	int min=a[i][j];
//	for (int k = 0; k < a.length; k++) 
//	{
//		if(a[i][k]<min)
//		smallELEiNRow=false;
//	}
//	boolean LargeELEinColumn=true;
//	int max=a[i][j];
//	for (int k = 0; k < a.length; k++)
//	{
//		if(a[k][j]>max)
//		LargeELEinColumn=false;
//		
//	}
//	if(smallELEiNRow==true && LargeELEinColumn==true )	
//	{
//	System.out.println(a[i][j]+ " is saddle point");	
//	}
//
//	
//	}}
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
		boolean Largecolumn=true;
		int max=a[i][j];
		for (int k = 0; k < a.length; k++)
		{
		if(a[k][j]>max)
		Largecolumn=false;
		}
		if(smallInRow && Largecolumn)
		System.out.print(a[i][j]+" ");
		}	
		}
	}

}
