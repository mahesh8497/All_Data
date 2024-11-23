package CharacterPattern;

public class patternq37 {

	public static void main(String[] args) {
int count1=0;
for (int i=0;i<6;i++)
{
	int count2=count1;
	for (int j=0;j<6;j++)
	{
		if (j-i<=0)
			System.out.print((char)(count2+65));
		else System.out.print(" ");
		count2=count2+5;
	}
	System.out.println();
	count1++;
	
}
	}

}
