package August18Recursion;

public class pairElement {

	public static void main(String[] args) {
		int[]a= {1,2,3,4};
		print(a,0,1);
		
	}

	private static void print(int[] a, int i, int j)
	{
		System.out.println(a[i]+" "+a[j]);	

		if(j < a.length-1)
			j++;
		else
		{
			i++;
			j =i+1;
		}
		if(i < a.length-1)
			print(a, i, j);
	}

}
