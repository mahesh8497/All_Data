package PatternQuestion;

public class ABC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a=new int[14][14];
		int n=a.length-1;
		for (int i = 0; i < a.length; i=i+2)
		{
		int count=0;
		for (int j = 0; j < a.length; j++)
		{
		if(j+i<a.length)
		{
			if(j<=n/2)
				System.out.print((char)(count++ +65));
			else
				System.out.print((char)(--count +65));
		}
		else
		{
			System.out.print(" ");
		}
		}
		n--;
		n--;
		System.out.println();
		}
		

	}

}
