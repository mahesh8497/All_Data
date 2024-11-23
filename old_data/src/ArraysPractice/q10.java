package ArraysPractice;

public class q10 {

	public static void main(String[] args) {
		int[]a= {1,2,8,6,4,8,4,2,4};
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
		for (int j = 0; j < a.length; j++)
		{
		if(a[i]>max)
			max=a[i];
		}	
		}
		System.out.println(max);
	}

}
