package Arraypractice;

import java.util.Iterator;

public class array28 {

	public static void main(String[] args) {
		int[][] a= {{6,3,1},{9,7,8},{2,4,5}};
		for (int i = 0; i < a.length; i++)
		{
		for (int j = 0; j < a.length; j++)
		{
		System.out.print(a[i][j]+" ");
		}	
		System.out.println();
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				boolean SmalliNaaray=true;
				int min=a[i][j];
				for (int k = 0; k < a.length; k++)
				{
				 if(a[i][k]<min)
				SmalliNaaray=false;
			    }
				boolean LargeiNaaray=true;
				int max=a[i][j];
				for (int k = 0; k < a.length; k++)
				{
				if (a[k][j]>max)
				LargeiNaaray=false;
				}
				if(SmalliNaaray==true && LargeiNaaray==true )
				System.out.println(" SaddlePoint is= "+a[i][j]);
			
			

			}}}
}
