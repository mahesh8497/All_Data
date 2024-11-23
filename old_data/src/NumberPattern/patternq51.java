package NumberPattern;

public class patternq51 {

	public static void main(String[] args) {

for (int i=0;i<9;i++)
{
	for (int j=0;j<5;j++)
	{
		if (j+i>=4 && i<5)
			System.out.print(i+1+" ");
		else if(i>=5 &&j-i>=-4)
			System.out.print(9-i+" ");
			else 
				System.out.print(" ");
	}
	System.out.println();
}
	}

}
