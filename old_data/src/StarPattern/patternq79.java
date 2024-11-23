package StarPattern;

public class patternq79 {

	public static void main(String[] args) {
for (int i=0;i<9;i++)
{
	for (int j=0;j<10;j++)
	{
		if(j-i<=0 && j+i<=8)
			System.out.print("*");
		else if (j+i>=9 && j-i>=1)
			System.out.print("*");
		else 
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
