package PatternQuestion;

public class q31 {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) 
		{
		for (int j = 0; j <6; j++)
		{
		if(j+i>=5)
			System.out.print((char)(j+i-5+65)+" ");
		else
			System.out.print(" ");
		}
		System.out.println();
		}
	}

}
