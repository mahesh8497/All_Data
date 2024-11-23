package ArraysPractice1;

public class cw1 {
//Write a program to calculate sum and average of arrayelements(Variations)
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int sum=0;
		int avg=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
			avg=sum/a.length;
		}
		System.out.println(sum);
		System.out.println(avg);
	}

}
