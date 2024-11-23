package companyImpQ;

import java.util.Scanner;

public class Fibbo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int a=0;
		int b=1;
		int c=0;
		int d=0;
		int temp=sc.nextInt();
		while(d<=temp)
		{
		    c=a+b;
		    a=b;
		    b=c;
		    d++;
		    System.out.println(c);
		}

	}

}
