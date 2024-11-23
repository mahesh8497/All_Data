package BasicProgram;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	
int a=sc.nextInt();
int b=a;
int d;
int sum=0;
while(b>0)
{
d=b%10;
sum=sum+d;
b=b/10;
}
if (a%sum==0)
	System.out.println("Harshad Number ");
else 
	System.out.println("Not Harshad Number ");

	}

}
