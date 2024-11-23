package june28MethodCWQ3;
import java.util.*;
public class BankAccount {
	public static void main(String[] args) {
		 AccountManagement m=new AccountManagement();
		 Scanner sc=new Scanner(System.in);
		 m.insertData();
		 m.displayData();
		 m.depositAmount();
		 m.withdrawAmount();
		while(true )
		{
			System.out.println("1 for deposite 2-withdraw");
			int s=sc.nextInt();
			if(s>2)
			{	
				System.out.println("thank u ");
				break;
			}	
			if(s==1)
			{
				m.depositAmount();
			}
			if(s==2)
			{
				m.withdrawAmount();
			}
		
		}
	}

}
