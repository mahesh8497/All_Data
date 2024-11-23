package SpiralPattern;

public class q8 {

	public static void main(String[] args) {
		int count=1;
		for (int i = 0; i <5; i++)
		{
	
		for (int j = 0; j < 5; j++)
		{
		if(j+i>=4)
		{
			System.out.print(count+" ");
			count=count+2;
		
		}
		else 
			System.out.print(" ");
		}	
		System.out.println();
		}
	}

}
