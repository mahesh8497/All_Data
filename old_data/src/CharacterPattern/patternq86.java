package CharacterPattern;

public class patternq86 {

	public static void main(String[] args) {
for(int i=0;i<5;i++)
{
	for (int j=0;j<5;j++)
	{
		if(j-i==0)
			System.out.print("o");
		else 
			System.out.print("x");
	}
	System.out.println();
}
	}

}