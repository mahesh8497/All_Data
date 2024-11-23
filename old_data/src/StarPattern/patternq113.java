package StarPattern;

public class patternq113 {

	public static void main(String[] args) {
for(int i=0;i<13;i++)
{
	for (int j=0;j<17;j++)
	{
//if()
if((j-i>=-4 && j+i>=3 && j<9 && j-i<=5)||(j+i>=12 && j>=9 && j+i<=20 && j-i<=14))
	//
		System.out.print("*");
	else 
		System.out.print(" ");
	}
	System.out.println();
}
	}

}
