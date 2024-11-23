package NumberPattern;

public class patternq45 {

	public static void main(String[] args) {
for (int i=0;i<9;i++)
{
	for(int j=0;j<9;j++)
	{
		if(j-i<=0)
			System.out.print(j+1);
		else 
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
