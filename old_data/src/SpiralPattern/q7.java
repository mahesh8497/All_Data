package SpiralPattern;

public class q7 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
		{
		for (int j = 0; j <9; j++)
		{
		if(j-i>=0 && j+i<=8 )
			System.out.print((char)(5-i+64));
	
		else
			System.out.print(" ");
		}	
		System.out.println();
		}
	}

}
