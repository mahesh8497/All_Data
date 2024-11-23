package August13;

public class equalityArray {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int []b= {2,3,4,5};
		
		//simple way more iterartion 
//		if(a.length==b.length)
//		{
//			boolean theyRsame=true;
//			for (int i = 0; i < b.length; i++)
//			{
//				if(a[i]!=b[i])
//				{
//					theyRsame=false;
//				break;
//				}
//			}
//			if(theyRsame)
//				System.out.println("same");
//			else 
//				System.out.println("not same");
//		}
		
		
		
		// Recursion
		
//		equality(a,b,0);
//	}
//
//	private static void equality(int[] a, int[] b, int i) 
//	{
//		if(a.length==b.length)
//		{
//			if(a[i]==b[i]) 
//			{
//				if(i<a.length-1)
//				equality(a, b, i+1);
//				else
//				{
//					System.out.println("same");
//					System.exit(0);
//				}
//			}
//			else
//			{
//				System.out.println("not");
//				System.exit(0);
//			}
//			
//		}
//		else {
//			System.out.println("not");
//			System.exit(0);
//		}
		
		
		
		
		//third Way smart way
	/*	if(a.length==b.length)
		{
			int i=0;
			for (; i < b.length; i++) 
			{
			if(a[i]!=b[i])
				break;
			}
			if(i==a.length)
				System.out.println("same");
			else
				System.out.println("not same");
		}
		else 
			System.out.println("not same");

	*/
		if(a.length==b.length)
		{
			int i = 0;
			for (; i < b.length; i++) 
			{
			if(a[i]!=b[i])
				break;
			}
			if(i==a.length)
				System.out.println("same");
			else 
				System.out.println("not same");
		}
		else 
			System.out.println("not same");
		
	}
}
