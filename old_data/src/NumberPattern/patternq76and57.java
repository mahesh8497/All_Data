package NumberPattern;

public class patternq76and57 {

	public static void main(String[] args) {
		int c=1;
		for (int i = 0; i <5; i++) 
		{
		for (int j = 0; j < 5; j++)
		{
		if(j-i<=0)
			System.out.print(c+++" ");
		else
			System.out.print(" ");
		}	
		System.out.println();
		}
	}

}
