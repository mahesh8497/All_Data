package PatternQuestion;

public class examq1 {

	public static void main(String[] args) {
		int counter=1;
		for (int i = 0; i < 5; i++) 
		{
			int cout=counter;
			int diff=4;
		for (int j = 0; j < 5; j++)
		{
		if(j-i<=0)
		{
			System.out.print(cout);
		cout=cout+diff;
		diff--;
		}
		}	
		System.out.println();
		counter++;

		}
	}
}

