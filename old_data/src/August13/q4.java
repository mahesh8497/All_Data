package August13;

public class q4 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int n=12;
//		int c=0;
//		for (int i = 0; i < a.length; i++) 
//		{
//		if(a[i]==n)
//		{
//			c++;
//			break;
//		}
//		}
//		if(c==0)
//			System.out.println("not present");
//		else 
//			System.out.println("present");
		boolean present=false;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==n)
				present=true;
		}
		if(present)
			System.out.println("present");
		else
			System.out.println("not present");
	}

}
