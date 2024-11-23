package june28MethodHWQ6;
import java.util.Scanner;
public class calculatesum
{
	int a=0;
	int b=0;
	public int sum() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two Number");
		a=sc.nextInt();
		b=sc.nextInt();
		int c=a+b;
		return c;
	}

}
