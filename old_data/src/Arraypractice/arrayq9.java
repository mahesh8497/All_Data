package Arraypractice;

public class arrayq9 {
//Write a program to find maximum element in a matrix.
	public static void main(String[] args) {
int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
int max=Integer.MIN_VALUE;
for (int i = 0;  i< a.length; i++)
{
	  for (int j = 0; j < a.length; j++)
	  {
		  if (a[i][j]>max)
				max=a[i][j];
	}
	  System.out.println(max+" ");
	
}
}

}
//int max=Integer.MAX_VALUE;
//for()
//for()
//if(a[i][j]>max)
//max=a[i][j]
//s.o.pln(max)