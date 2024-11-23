package BasicProgram;

import java.util.Scanner;

public class CWQ6 {
	public static void main(String[] args) {
	
//int p=30000;
//int r=2;
//int n=3;
//int t=4;
//double a=(1+(r/(n*100.0)));
//int b=n*t;
//double amount=p*Math.pow(a, b);
//System.out.println("CI= "+amount-p);
//		
//		
//	//	int k=2;
//		//double a=(k++ - ++k + k-- - k++ + ++k -k-- + --k + k+ k--- k + --k+ k++);
//	//	System.out.println(a);
//		System.out.println("HWQ6");
//		//int c=39;
//		//double f=(32+(1.8*c));
//		//System.out.println("Feranide is"+f);
//		//double fr=102.2;
//		//double cel=((fr-32)/1.8);
//		//System.out.println("Celcius is "+cel);
//		//int cels=39;
//		//double kel=c+273.15;
//		//System.out.println("Kelvin is "+kel);
//		//double fa=99;
//		//double kelvin=((fa-32)*0.55+273.15);
//		//System.out.println(kelvin);
//		System.out.println("HWQ8");
//		//System.out.println("\"Hefshine\"");
//		System.out.println("By using Scanner");
//		System.out.println("CWQ2");
//		Scanner sc=new Scanner (System.in);
//		//System.out.println("Choice the Number from 0 to 6");
//		//int num=sc.nextInt();
//		//if (num>6)
//		//System.out.println("Invalid Number");
//		//else if (num==0)
//			//System.out.println("Sunday");
//		//else if(num==1)
//			//System.out.println("Monday");
//		//else if(num==2)
//			//System.out.println("Tuesday");
//		//else if (num==3)
//			//System.out.println("Wednesday");
//		//else if(num==4)
//			//System.out.println("Thursday");
//		//else if (num==5)
//			//System.out.println("Friday");
//	//else if(num==6)
////		System.out.println("Saturday");
//		
//	System.out.println("CWQ3");
////	System.out.println("Enter the Basic Salary");
////	int BasicSalary=sc.nextInt();
////	double gS=0;
////	if(BasicSalary<1000)
////		gS=BasicSalary+0.2*BasicSalary+0.8*BasicSalary;
////	else if (BasicSalary<=20000)
////		gS=BasicSalary+0.25*BasicSalary+0.9*BasicSalary;
////	else 
////		gS=BasicSalary+0.3*BasicSalary+0.95*BasicSalary;
////	System.out.println("GrossSlary is= "+gS);
//	System.out.println("CWQ4");
////	System.out.println("Enter the Unit");
////	int unit=sc.nextInt();
////double bill;
////if(unit<=50)
////	bill=unit*0.50;
////else if(unit <=150)
////	bill=50*0.50+(unit+50)*0.75;
////else if(unit<250)
////	bill=50*0.50+100*0.75+(unit-150)*1.2;
////else 
////	bill=50*0.50+100*0.75+100*1.2+(unit-250)*1.5;
////	double FinalBill=1.2*bill;
////	System.out.println(FinalBill);
//	System.out.println("HWQ5");
////	System.out.println("Enter the character");
////	char ch=sc.nextLine().charAt(0);
////	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
////		System.out.println("Vowel");
////	else
////	System.out.println("consonant");
//	System.out.println("HWQ8");
////	System.out.println("Enter the Cost Price");
////	int cp=sc.nextInt();
////	System.out.println("Enter the Selling Price");
////	int sp=sc.nextInt();
////	int profit =sp-cp;
////	int Loss= cp-sp;
////
////	if(sp>cp)
////		System.out.println("Profit is= "+profit);
////	else 
////		System.out.println("Loss is= "+Loss);
//	System.out.println("HWQ11");
////	System.out.println("Enter the year");
////	int year=sc.nextInt();
////	if(year%4==0&&year%100!=0)
////		System.out.println("LeapYear");
////	else if(year%100==0&&year%400==0)
////	System.out.println("LeapYear");
////	else 
////		System.out.println("NotLeapYear");
////		
//	System.out.println("ControlStatement 2");
//	System.out.println("CWQ1");
////	System.out.println("Enter the two number");
////	int a=sc.nextInt();
////	int b=sc.nextInt();
////	for(int i=1;i<10;i++)
////	{
////		int c;
////		c=a+b;
////		a=b; 
////		b=c;//swapping of two Number
////		System.out.print(c+" ");
////	}
//	System.out.println("HWQ2");
////	int a=2;
////	int b;
////	for (int i=1;i<=10;i++)
////	{
////		b=a*i;
////		System.out.println(b);
////	}
System.out.println("CWQ1");
int a=1;
int b=1;
int c=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the value");
int num=sc.nextInt();
System.out.print("1,1"+" ");
while(c<=num)
{
	c=a+b;
	System.out.print(c+" ");
	a=b;
	b=c;
}


//	System.out.println("CWQ2");
////	int a=4;
////	int p=3;
////	double w=Math.pow(a,p);
////System.out.println(w);	
//	System.out.println("HWQ4");
////	System.out.println("Enter the Number");
////	int num=sc.nextInt();
////	int fact=1;
////	for(int i=1;i<=num;i++)
////	{
////		 fact=fact*i;
////	}
////	
////	System.out.println(fact);
//	
//System.out.println("HWQ5 Q6");
////System.out.println("Enter the number");
////int num=sc.nextInt();
////int count=0;
////int sum=0;
////int digit=0;
////while(num>0)
////{
////	digit=num%10;
////	num=num/10;
////	sum=sum+digit;
////	count++;
////}
////System.out.println(sum);
////System.out.println(count);
//	
//	System.out.println("HWQ7");
////	System.out.println("Enter the starting number");
////	int start=sc.nextInt();
////	System.out.println("Enter the end number");
////	int end=sc.nextInt();
////	for(int i=start;i<end;i++)
////	{
////		if(i%2==0)
////			System.out.println(i+"Even");
////		else 
////			System.out.println(i+"Odd");
////	}
//	
//	System.out.println("HWQ9");
////	System.out.println("Enter the starting number");
////	int start=sc.nextInt();
////	System.out.println("Enter the end number");
////	int end=sc.nextInt();
////	for(int i=start;i<end;i++)
////	{
////		if(i%10==7)
////			System.out.println(i);
////	}
////	
//	System.out.println("HWQ8"); 
////	System.out.println("enter the number");
////	int num=sc.nextInt();
////	int num1=num;
////	int num2=0;
////	while(num>0)
////	{
////		num2=num2*10;
////		num2=num2+num%10;
////		num=num/10;
////	}
////	if(num1==num2)
////	{
////		System.out.println("Palendrome Number");
////	}
////	else 
////		System.out.println("Not Palindrome Number");
////	
//	System.out.println("HWQ21");
//	/*
//	System.out.println("Enter the number");
//	int num=sc.nextInt();
//	int originalnum=num;
//	int sq=num*num;
//	int count=0;
//	while(num>0)
//	{
//		num=num/10;
//		count++;
//	}
//	int den=(int)Math.pow(10, count);
//	int firsyPart=sq/den;
//	int secondPart=sq%den;
//	if(firsyPart+secondPart==originalnum)
//		System.out.println("Kaprekar Number");
//	else 
//		System.out.println("This is not kaprekar Number");
//	*/
//	
//			
////	for(int i=0;i<=5;i++)
////	{
////		for (int j=0;j<5;j++)
////		{
////			if(j-i<0)
////				System.out.print("*");
////		}
////		System.out.println();
////	}
////	
//	System.out.println("HWQ13");
//
//	/*for (int i=0;i<=5;i++)
//	{
//		for (int j=0;j<=5;j++)
//		{
//			if(j-i<0)
//				System.out.print(j+1);
//		}
//		System.out.println();
//	}
//	*/
//	System.out.println("HWQ14");
//
//	/*for (int i=0;i<5;i++)
//	{
//		for (int j=0;j<5;j++)
//		{
//			if (j-i<=0)
//			System.out.print(i+1-j);
//		}
//		System.out.println();
//	}
//	*/
//	System.out.println("HWQ15");
////	int count =1;
////	for (int i=0;i<5;i++)
////	{
////		int count1=count;
////		int diff=4;
////		for (int j=0;j<5;j++)
////		{
////			if (j-i<=0)
////				System.out.print(count1+" ");
////			count1=count1+diff;
////			diff--;
////		}
////		System.out.println();
////		count++;
////	}
//System.out.println("bookletQ18");
////for(int i=0;i<17;i=i+2)
////{
////	for (int j=0;j<9;j++)
////	{
////		if(j-i<=0&&j+i<17)
////		
////		System.out.print("*");
////		else 
////			System.out.print(" ");
////	}
////	System.out.println();
////}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
