package recurtion;

public class q9 {
	static int count=0;
//leader element
	public static void main(String[] args) {
		int[]a= {89,82,34,22,1};
		leader(a,0,1);
		
	}

	private static void leader(int[] a, int i, int j) {

		
		if(a[j]>=a[i])
				count++;
		if(j<a.length-1)
			j++;
		else
			{
			if(count==0)
				System.out.print(a[i]+" ");
			
			i++;
			
			count =0;
			
			j=i+1;
			}
		
		if(i<a.length-1)
			leader(a, i, j);
		
	}
	}


