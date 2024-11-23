package BasicProgram;

import java.util.Scanner;

public class kaprekarnumber {

	public static void main(String[] args) {
		//Scanner sc=new Scanner (System.in);
	//	System.out.println("Enter the Number");
//int n=sc.nextInt();
int n=35;
int originaln=n;
int sq=n*n;
int count=0;
while(n>0)
{
	n=n/10;
	count++;
}
int den=(int)Math.pow(10, count);
int firstpart=sq/den;
int secondpart=sq%den;
if(firstpart+secondpart==originaln)
	System.out.println("kaprekarNumber");
else
	System.out.println("Not");
	}
}
