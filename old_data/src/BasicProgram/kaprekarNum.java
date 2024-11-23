package BasicProgram;

import java.util.Scanner;

public class kaprekarNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
//		int originalnumber=num;
//		int sq=num*num;
//		int count=0;
//		while(num>0)
//		{
//			num=num/10;
//			count++;	
//		}
//		int dev=(int) Math.pow(10, count);
//		int firstpart=sq/dev;
//		int secondpart=sq%dev;
//		if(firstpart+secondpart==originalnumber)
//			System.out.println("kaprekar number");
//		else
//			System.out.println("not");
		int on=num;
		int sq=num*num;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		int dev=(int) Math.pow(10, count);
		int fp=sq/dev;
		int sp=sq%dev;
		if(fp+sp==on)
			System.out.println("kaprekar Number");
		else
			System.out.println("not kaprekar Number");
	}

}
