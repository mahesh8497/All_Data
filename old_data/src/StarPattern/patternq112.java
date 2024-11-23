package StarPattern;

public class patternq112 {

	public static void main(String[] args) {
/*for(int i=0;i<5;i++)
{
	for(int j=0;j<7;j++)
	{
		if(i==0)
		{
			if(j%3==0)
				System.out.print(" ");
			else
				System.out.print("*");
		}
		else if(i==1)
		{
			if(j%3==0)
				System.out.print("*");
			else
				System.out.print(" ");
				
		}
		else 
		{
			if(j-i==-1||j+i==7)
				System.out.print("*");
			else
				System.out.print(" ");
		}
	}
	System.out.println();
}*/
		for (int i = 0; i <5; i++)
		{
		for (int j = 0; j <7; j++)
		{
			if(i==0)
			{
				if(j%3==0)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			else if(i==1)
			{
				if(j%3==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			else
			{ 
				if(j-i==-1|| j+i==7)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
		}	
		System.out.println();
		}
	}

}
