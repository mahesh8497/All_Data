package BasicProgram;

import java.util.Scanner;

public class Palandrome {
//
//	public static void main(String[] args) {
//		int num1=123271;
//		int temp=num1;
//		int num2=0;
//		while(temp>0)
//		{
//			num2=num2*10;
//			num2=num2+temp%10;
//			temp=temp/10;
//		
//		}
//		System.out.println("given number is "+num1);
//		if(num1==num2)
//			System.out.println("Given number is  palandrome");
//		else
//			System.out.println("given number is not palndrome");
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1=sc.nextInt();
		int temp=num1;
		int num2=0;
		while(temp>0) {
			num2=num2*10;
			num2=num2+temp%10;
			temp=temp/10;
		}
		if (num1==num2)
			System.out.println("palondrome");
		else
			System.out.println("Not palondrome");
	}
//	}

}
