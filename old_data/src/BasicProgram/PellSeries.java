 package BasicProgram;

import java.util.Scanner;

public class PellSeries {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
int a=0;
int b=1;
int c=0;
System.out.println("Enter the Number");
int n=sc.nextInt();
 System.out.print(a+" ");
 System.out.print(b+" ");
for(int i=0;i<=n;i++)
{
	c=(2*b)+a;
	a=b;
	b=c;
	System.out.print(c+" ");

}
	}

}
