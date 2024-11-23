package StarPattern;

public class patternq3 {

	public static void main(String[] args) {
		//first ways
for(int i=0;i<5;i++)
{
	for (int j=0;j<5;j++)
	{
		if(j-i<=0)
			System.out.print("*");
		else 
			System.out.print(" ");
	}
	System.out.println();
}
//second way
for (int i = 0; i <5; i++) 
{
	for (int j = 0; j <=i; j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
//third way recursion 
	printI(0,0);


	}

	private static void printI(int i, int j)
	{
		if(i<5)
		{
		printJ(i,0);
		System.out.println();
		i++;
		printI(i, j);
		
	}
	}

	private static void printJ(int i, int j)
	{
		
		if(j<5)
		{
			if(j-i<=0)
				System.out.print("*");
			else 
				System.out.print(" ");
			j++;
			printJ(i, j);
		}
	}

}
