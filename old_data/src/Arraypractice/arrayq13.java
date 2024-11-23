package Arraypractice;
public class arrayq13 {
//) Write a program to create an array of its anti-diagonals from a given square matrix. 
	public static void main(String[] args) {
int[] a1= {1,2,3};
int[] a2={4,3,2};
int[] a3={6,5,4};
int[][] a= {a1,a2,a3};
for (int i = 0; i < a.length; i++)
{
	for (int j = 0; j < a.length; j++) 
	{
		System.out.print(a[i][j]+" ");

	}
	System.out.println();
}
System.out.println();
for (int i = 0; i < a.length; i++)
{
for (int j = 0; j < a.length; j++) 
{
	if(j-i!=0 && j+i!=2)
		System.out.print(a[i][j]+" ");
	else
		System.out.print(" ");
}
System.out.println();
}
//for (int i = 0; i < a.length; i++) 
//{
//	for (int j = 0; j < a.length; j++)
//	{
//		if (j-i!=0&&j+i!=2)
//			System.out.print(a[i][j]+" ");
//		else 
//			System.out.print(" ");
//	}
//	System.out.println();
//}
	}

}
