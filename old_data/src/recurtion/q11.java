package recurtion;

public class q11 {
//diagonal element
	public static void main(String[] args) {
		int [] [] a= {{1,2,3},
	              {5,6,8},
	              {8,5,9}};
		digonalElem(a,0,0);
	}

	private static void digonalElem(int[][] a, int i, int j) 
	{
if(j-i==0 || j+i==2)
{
	System.out.print(a[i][j]+" ");
}
else
	System.out.print(" ");
if(j<a.length)
	j++;
else
{
	j=0;
	i++;
	System.out.println();
}
if (i<a.length) 
{
	digonalElem(a, i, j);
}
	}

}
