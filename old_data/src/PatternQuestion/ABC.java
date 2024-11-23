package PatternQuestion;

public class ABC {

	public static void main(String[] args) {
//		for(int i=0;i<7;i++)
//		{
//			int count=0;
//			for(int j=0;j<13;j++)
//			{
//				if(j+i<=6)
//				{
//					System.out.print((char)(count+65));
//					if(j<6)
//				count++;
//				}
//				else if(j-i>=6)
//				{
//					count--;
//					System.out.print((char)(count+65));
//				}
//				//	else 
//					//System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
	for (int i = 0; i < 7; i++) 
	{
		int cnt=0;
	for (int j = 0; j < 13; j++)
	{
		if(j+i<=6)
		{
			System.out.print((char)(cnt+65));
			if(j<6)
			cnt++;
		}
		else if(j-i>=6)
		{
			cnt--;
			System.out.print((char)(cnt+65));
		}
		else
			System.out.print(" ");
	}	
	System.out.println();
	}

	}

}
