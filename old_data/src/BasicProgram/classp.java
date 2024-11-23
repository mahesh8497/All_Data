package BasicProgram;

public class classp {

	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++)
//		{
//		for (int j = 0; j < 10; j++) 
//		{
//		if((j-i<=0 && i%2==0) || (i%2!=0 && j-i<=-1))
//			System.out.print("*");
//		else 
//			System.out.print(" ");
//		}
//		System.out.println();
//
//		}
		for (int i = 0; i <10; i++) 
		{
		for (int j = 0; j < 10; j++)
		{
		if((j-i<=0 && i%2==0)|| (i%2!=0 && j-i<=-1))
			System.out.print("*");
		else
			System.out.print(" ");
		}	
		System.out.println();
		}
	}

}
