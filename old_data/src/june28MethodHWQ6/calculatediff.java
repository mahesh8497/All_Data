package june28MethodHWQ6;

import java.util.Scanner;

public class calculatediff 
{
	int a=0;
	int b=0;
	int c=0;
	public int diff()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the two number ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		return c;
	}
}
