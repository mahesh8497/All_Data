package companyImpQ;

public class q1 {

	public static void main(String[] args) {
		int[]a1=new int[] {1,2,3,4,5,6,7,8};
		int[]a2=new int[] {1,2,8,6,5,7,4,3};
		if(a1.length==a2.length)
		{
			int i = 0;
		for (; i <a1.length; i++) 
		{
			if(a1[i]!=a2[i])
				break;
		}
		if(i==a1.length)
		{
			
			System.out.println(true);
		}
		else
			System.out.println(false);
		}
		else
			System.out.println(false);

	}

}
