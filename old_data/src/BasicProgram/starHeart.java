package BasicProgram;

public class starHeart {

	public static void main(String[] args) {
for(int i=0;i<13;i++)
{
	for (int j=0;j<17;j++)
	{
	if((j-i>=-4 && j+i>=3 &&j<=8&&j-i<=5))
		 System.out.print("*");
	else if (j>8&&j+i>=11&&j-i<=13&&j+i<=20)
		 System.out.print("*");
	else
		System.out.print(" ");
	} 
	System.out.println();
}
	}

}
/*
 * 
jmin                         jmax
imin	1       2     3        4       5 
16      17    18       19      6 
15      24    25       20      7 
14      23    22       21      8 
imax	13      12    11       10      9 
*/