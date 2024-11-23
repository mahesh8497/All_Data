package August19p;

public class Transpose {

	public static void main(String[] args) {
		/*
		int[][]a= {{1,2,3},{4,3,2},{5,6,7}};
		int[][]b=new int[a.length][a.length];
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
		*/
		int[][]a= {{7,6,5},{8,9,5},{1,2,3}};
		int[][]b= new int[a.length][a.length];
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
