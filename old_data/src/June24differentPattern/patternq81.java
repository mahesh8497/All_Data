package June24differentPattern;

public class patternq81 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			int count=1;
			for(int j=0;j<10;j++)
			{
				if(j-i<=0)
					System.out.print((j+count));
				else if(j+i>=9)
					System.out.print((9-j+count));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
