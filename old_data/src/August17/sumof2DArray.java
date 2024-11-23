package August17;

public class sumof2DArray {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,7},{7,6,5}};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
			sum=sum+a[i][j];	
			}
		}
		System.out.println("sum of the element= "+sum);
	}

}
