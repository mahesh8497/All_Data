package BasicProgram;

import java.util.Scanner;

public class bill1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the unit ");
		int unit=sc.nextInt();
		double bill;
		if(unit<=50)
		{
			bill=unit*0.50;
		}
		else if(unit<=150)
		{
			bill=50*0.5+((unit-50)*0.75);
			
		}
		else if(unit<250)
		{
			bill=50*0.5+100*0.75+((unit-150)*0.75);
		}
		else 
		{
			
			bill=50*0.5+100*0.75+100*1.2+((unit-250)*1.5);
		}
		double finalbill=1.2*bill;
		System.out.println(finalbill);
	}

}
