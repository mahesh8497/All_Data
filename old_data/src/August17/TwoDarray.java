package August17;

import java.util.Arrays;

public class TwoDarray {

	public static void main(String[] args) {
		int[][]a= {{1,2,7,3},{3,2,1,7},{4,3,2,2}};
		for (int i = 0; i < a.length; i++) 
		{
		for (int j = 0; j < a[i].length; j++) 
		{
			//if(j-i<=0)//by pattern
		System.out.print(a[i][j]+" ");
			
		}	
		System.out.println();
		}
	}

}
