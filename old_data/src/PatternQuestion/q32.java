package PatternQuestion;

public class q32 {

	public static void main(String[] args) {
		for (int i = 0; i <=5; i++)
		{
		for (int j = 0; j <=5; j++)
		{
		if(j+i<6)
			System.out.print((char)(5-j+65));
		else 
			System.out.print(" ");
		}	
		System.out.println();
		}
	}

}
