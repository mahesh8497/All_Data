package August17;

public class addition {

	public static void main(String[] args) {
		int[][]a= {{1,2,3,8},{1,8,7,6},{8,7,6,4},{1,8,7,6}};
		int[][]b= {{1,2,3,8},{1,8,7,6},{8,7,6,4},{1,8,7,6}};
		int[][]c=new int [4][4];
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		for (int j = 0; j < c.length; j++)
		{
		System.out.print(c[i][j]+" ");	
		}
		System.out.println();
		}
		}}