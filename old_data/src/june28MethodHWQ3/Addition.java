package june28MethodHWQ3;

import java.util.Scanner;

public class Addition 
{
	int a=0;
	int b=0;
public double add() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two  number");
	a=sc.nextInt();
	b=sc.nextInt();
	int  c=a+b;
	return c;			
}
public double sub()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two  number");
	a=sc.nextInt();
	b=sc.nextInt();
	int  c=a-b;
	return c;
}
public double mul()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two  number");
	a=sc.nextInt();
	b=sc.nextInt();
	int  c=a*b;
	return c;
}
public double div()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two  number");
	a=sc.nextInt();
	b=sc.nextInt();
	int  c=a/b;
	return c;
}
}
