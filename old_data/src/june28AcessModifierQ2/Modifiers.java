package june28AcessModifierQ2;
import java.util.Scanner;
public class Modifiers {
	String name;
	int emp_id;
	public void Employeeinfo()
	{
		Scanner sc=new Scanner(System.in);
		
		name=sc.nextLine();
		emp_id=sc.nextInt();
		System.out.println("Employee Name "+name);	
		System.out.println("Employee Id "+emp_id);
		
	}

}
