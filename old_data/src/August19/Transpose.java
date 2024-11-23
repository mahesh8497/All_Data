package August19;

public class Transpose {

	public static void main(String[] args) {
		int[][]a= {{1,2,3},{7,6,5},{8,6,5}};
		int[][]b=new int[3][3];
//		for (int i = 0; i < a.length; i++)
//		{
//		for (int j = 0; j < a[i].length; j++)
//		{
//		System.out.print(a[i][j]+" ");	
//		}	
//		}
		for (int i = 0; i < a.length; i++) 
		{
		for (int j = 0; j < a[i].length; j++) 
		{
		b[j][i]=a[i][j];	
		}	
		}
		for (int i = 0; i < b.length; i++) 
		{
		for (int j = 0; j < b[i].length; j++)
		{
		System.out.print(b[i][j]+" ");	
		}	
		System.out.println();
		}
	}

}
