package NumberPattern;

public class patternq41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		for (int i = 0; i <=9; i++) 
		{
			int c1=c;
		for (int j = 0; j <5; j++) 
		{
		if(j-i>=0 || j+i>=9)
			System.out.print(c1++);
		else
			System.out.print(" ");
	
		}
		if(i<=4 )
			c++;
		else 
			c--;
		if(i==4)
		c--;
		System.out.println();
		}
	}

}
