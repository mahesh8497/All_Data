package NumberPattern;

public class patternq108 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) 
		{
		for (int j = 0; j <5; j++) 
		{
		if(j-i==0)
			System.out.print(j+1);
		else
			System.out.print("0");
		}	
		System.out.println();
		}
	}

}