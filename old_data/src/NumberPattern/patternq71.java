package NumberPattern;

public class patternq71 {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i = i + 2) {
			int count = 1;
			for (int j = 0; j < 9; j++) {
				if (j - i <= 0) 
				{
					System.out.print(count);
					if (j < i / 2)
						count++;
					else
						count--;
				} 
				
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}

}
