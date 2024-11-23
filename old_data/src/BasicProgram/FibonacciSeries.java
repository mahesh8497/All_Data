   
package BasicProgram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
int a=1;
int b=0;
int c=0;
		
Scanner sc=new Scanner (System.in);
System.out.println("Enter the Number");
int num=sc.nextInt();
System.out.print(b+" ");
while(c<=num)
{
	c=a+b;
	System.out.println(c+" ");
	a=b;
	b=c;
}
	}

}
