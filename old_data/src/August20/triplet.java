package August20;

public class triplet {

	public static void main(String[] args) {
		int[]a= {5,1,3,4,7};
		int c=0;
		int sum;
		for (int i = 0; i < a.length; i++) 
		{
		for (int j = i+1; j < a.length; j++)
		{
		for (int k = j+1; k < a.length; k++)
		{
		sum=a[i]+a[j]+a[k];	
		if(a[i]+a[j]+a[k]<12)
		{
			c++;
			System.out.println(a[i]+"+"+a[j]+"+"+a[k]+"<12");
		}
	
		}	
		}	
		}
		System.out.println(c);
	}

}
