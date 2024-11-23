package BasicProgram;

class w {

	public static void main(String[] args) {
		for(int i=0;i<7;i++)
		{
			int count=0;
			for (int j=0;j<13;j++)
			{
				if (j+i<7)
				{
					System.out.print((char)(count+65));
					if(j<6)
						count++;
				}
				else if (j-i>=6)
				{
					count--;
					System.out.print((char)(65+count));
				}
				else 
					System.out.print(" ");
					
			}
			System.out.println();
		}
}
}