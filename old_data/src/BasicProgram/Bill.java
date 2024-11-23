  package BasicProgram;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the unit");
		int unit=sc.nextInt();
		sc.close();
		double bill;
		if(unit<=50)
			bill=unit*0.50;
		else if(unit<=150)
			bill=50*0.50+((unit-50)*0.75);
		else if(unit<=250)
			bill=50*0.50+100*0.75+((unit-150)*1.2);
		else
			bill=50*0.5+100*0.75+100*1.2+((unit-250)*1.5);
		double finalbill=1.2*bill;
		System.out.println(finalbill);
}

}
