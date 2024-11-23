package june25bOOPs;
import java.util.Scanner;
public class welcomeaddsubmult {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME");
   while(true)
   {
	   System.out.println("Enter the Number 1-add,2-sub,3-multi,4-quit");
	   int choice=sc.nextInt();
	   
	    if(choice>=4)
	   	{
	   		System.out.println("Quit");
	   		break;
	   	}else
	   	{
	   		System.out.println("enter two number");
	   		int a=sc.nextInt();
	 	   int b=sc.nextInt();
	 	   calculator m=new calculator();
	 	   	if(choice==1)
	 	   	{
	 	   		m.add(a, b);
	 	   	}
	 	   	else if(choice==2)
	 	   	{
	 	   		m.sub(a, b);
	 	   	}
	 	   	else if(choice==3)
	 	   	{
	 	   		m.mul(a, b);
	 	   	}
	 	   	
	   	}
	   

   }

	}

}
