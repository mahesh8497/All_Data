package August18;

public class q4pairElement {

	public static void main(String[] args) {
		int[]a= {1,2,3,4};
		for (int i = 0; i < a.length; i++) 
		{
		for (int j =i+1; j < a.length; j++ ) 
			//(int(j=i+1;j<a.length;j++)
		{
		System.out.println(a[i]+" "+a[j]);	
		}	
		}
	}

}
