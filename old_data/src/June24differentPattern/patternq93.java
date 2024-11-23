package June24differentPattern;

public class patternq93 {

	public static void main(String[] args) {
for(int i=0;i<5;i++)
{
	for (int j=0;j<9;j++)
	{
		if (j-i==0||j+i==8)
			System.out.print("N"); 
		else 
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
