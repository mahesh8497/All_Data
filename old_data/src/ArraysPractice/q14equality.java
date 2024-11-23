package ArraysPractice;

public class q14equality {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b= {1,2,3,4,5};
	if(a.length==b.length)
	{
		boolean TheyRsame=true;
		for (int i = 0; i < b.length; i++) 
		{
			if(a[i]!=b[i])
			{
				TheyRsame=false;
			break;
			}
		}
		if(TheyRsame)
			System.out.println("same");
		else
			
			System.out.println("not same");
	}
	
	
	}

}
