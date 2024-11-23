package StarPattern;

public class patternq78 {

	public static void main(String[] args) {
for (int i=0;i<5;i++)
{
	for(int j=0;j<20;j++)
	{
		if(j-i>0 && j<5)
			System.out.print(" ");
		else if(j+i>9&&j-i<10)
			System.out.print(" ");
		else if(j+i<19 && j>14)
			System.out.print(" ");
		else 
			System.out.print("*");
	}
	System.out.println();
}
	}

}
