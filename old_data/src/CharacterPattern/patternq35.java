package CharacterPattern;

public class patternq35 {

	public static void main(String[] args) {
int count=0;
for (int i=0;i<6;i++)
{
	for (int j=0;j<6;j++)
	{
		if (j-i<=0)
			System.out.print((char)(count+++65));
		else 
			System.out.print(" ");
	}
	System.out.println();

}
	}

}
