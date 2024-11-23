package june30MethodCWQ3;
import java.util.Scanner;
public class Test {
	int evenoddNumber;
	int factorialNumber;
	int sumofDigitNumber;
	public Test(int evenoddNumber,int factorialNumber,int sumofDigitNumber)
	{
		super();
		this.evenoddNumber=evenoddNumber;
		this.factorialNumber=factorialNumber;
		this.sumofDigitNumber=sumofDigitNumber;
	}
	void evenodd() 
	{
		int evenoddNumber=12;
		if(evenoddNumber%2==0)
			System.out.println("Given Number is Even");
		else System.out.println(" Given Number is odd");
	}
	void factorialNumber()
	{
		int i=1;
		int factorial=1;
		int num=factorialNumber;
		do
		{
			factorial=factorial*i;
			i++;
		}
		while(i<=num);
	System.out.println("Factorial of Given Number is= "+(factorial));
	}
	void sumofDigitNumber()
	{
		int sum=0;
		int divisionCounter=0;
		int num=sumofDigitNumber;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
			divisionCounter++;
		}
		System.out.println("Sum of Digit Number= "+(sum));
		
	}

}
