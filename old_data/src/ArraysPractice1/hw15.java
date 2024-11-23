package ArraysPractice1;

public class hw15 {

	public static void main(String[] args) {
		int[]a= {7,6,5,4,8,3,2,5,3};
		for (int i = 0; i < a.length; i++) 
		{
		int c=0;
		for (int j = i+1; j < a.length; j++) 
		{
			if(a[j]>a[i])
				c++;
		}
		if(c==0)
			System.out.println(a[i]+" ");
		}
	}

}
