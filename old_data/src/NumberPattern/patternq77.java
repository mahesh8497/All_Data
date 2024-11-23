package NumberPattern;

public class patternq77 {

	public static void main(String[] args) {
		int count1=1;
for (int i=0;i<5;i++)
{
	int count2=count1;
	int diff=4;
	for (int j=0;j<5;j++)
	{
	if(j-i<=0)
	{
		System.out.print(count2+" ");
		count2=count2+diff;
		diff--;
	}
	}
	System.out.println();
	count1++;
}
	}

}
