package BasicProgram;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary");
		int basicSalary=sc.nextInt();
		double grossSalary=0;
		if(basicSalary<=10000)
		{
			grossSalary=basicSalary+(0.2*basicSalary)+(0.8*basicSalary);
		}
		else if(basicSalary<20000)
		{
			grossSalary=basicSalary+(0.25*basicSalary)+(0.9*basicSalary);	
		}
		else
		{
			grossSalary=basicSalary+(0.3*basicSalary)+(0.95*basicSalary);
		}
		System.out.println("grossSalary "+grossSalary);
	}

}
