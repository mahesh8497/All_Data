package NumberPattern;

public class patternq59 {

	public static void main(String[] args) {
for (int i=0;i<9;i++)
{
	for (int j=0;j<5;j++)
	{
		if (j-i>=0 || j+i>=8)
		{
			if(i<=4)
				System.out.print(j-i+1);
			else
				System.out.print(j+i-7);

		}
		else 
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
