package companyImpQ;

public class SecondMax {

	public static void main(String[] args) {
		int[]a= {7,134,6,512,8,3,212,6,4,12};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
		if(a[i]>max1)
		{
			max2=max1;
			max1=a[i];
		}
		else if(a[i]>max2 && a[i]<max1)
		{
			max2=a[i];
		}
		}
		System.out.println(max2);
		
	}
}
