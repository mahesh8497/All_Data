package StarPattern;

public class patternq75 {

	public static void main(String[] args) {
for (int i=2;i<=11;i=i+2)
{
	for (int j=0;j<12;j++)
	{
		if (j-i<=0)
		{
			if(i==2*j)
				System.out.print(" ");
			else 
				System.out.print("*");
		}
	
		else 
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
