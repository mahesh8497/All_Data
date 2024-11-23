package recurtion;

public class q14 {
//Sumation
	 static double sum=0;
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		print(a,0);
		System.out.println(print(a,a.length));
		

	}

	private static double print(int[] a, int i) 
	{
		
		
			sum=sum+a[i];
		if(i<a.length)
			i++;
		return sum;
		
	}

}
