package companyImpQ;
import java.util.*;
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num =sc.nextInt(), number,  total = 0;
//
//        number = num;
//        while (number != 0)
//        {
//          int  temp = number % 10;
//            total = total + temp*temp*temp;
//            number = number/10;
//        }
//
//        if(total == num)
//            System.out.println(num + " is an Armstrong number");
//        else
//            System.out.println(num + " is not an Armstrong number");
		
		 int num1=num;
		 while(num1!=0)
		 {
			 int temp=num1%10;
			 total=total+total*total*total;
			 num1=num1/10;
		 }
		 if(total==num1)
			 System.out.println("armstrong");
		 else
			 System.out.println("Not armstrong");
		
		
	}

}
