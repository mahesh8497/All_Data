package june28MethodCWQ3;
import java.util.Scanner;
public class AccountManagement
{
	int d=0;
	int balance=0;
public void insertData()
{
	Scanner sc=new Scanner (System.in);
	System.out.println("Welcomem To  Bank");
	System.out.println("To create Account ");
	System.out.println("Enter the Adhar Card Number");
	int a=sc.nextInt();
	System.out.println("Enter the Mobile number");
	long m=sc.nextLong();
	System.out.println("Welcome, Your  account is created");
	System.out.println("Your Balance is 0");
}
public void displayData()
{
	System.out.println("Your Account Number is = 123456789");
	
}
public void depositAmount()
{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the deposite amount");
	int d=sc.nextInt();
	 balance =balance+d;
	 
	System.out.println("Your Balance is "+balance);
}
public void withdrawAmount()
{
	Scanner sc=new Scanner (System.in);

	System.out.println("Enter the withdraw amount ");
	int w=sc.nextInt();
	
		if(w>balance)
			System.out.println("Insufficient Fount");
		else
		{
			balance=balance-w;
		System.out.println("Your Balance is"+(balance));

		}	
}
}
