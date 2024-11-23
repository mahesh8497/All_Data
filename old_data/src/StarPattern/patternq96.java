package StarPattern;

public class patternq96 {

	public static void main(String[] args) {
for (int i=0;i<6;i++)
{
	for (int j=0;j<9;j++)
	{
		if (j+i==4||j-i==4||i==5)
			System.out.print("*");
		else 
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
