package companyImpQ;
import java.util.*;
public class Palandrome {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int num1=0;
		while(temp>0)
		{
			num1=num1*10;
			num1=num1+temp%10;
			temp=temp/10;
		}
		System.out.println("given number is "+num1);
		if(num==num1)
			System.out.println("Given number is  palandrome");
		else
			System.out.println("given number is not palndrome");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//		int p = 1213;
//        if(isPalindrome(p)) 
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not palindrome");
//    }
//    public static boolean isPalindrome(int x) {
//        int num = x;
//        int rev = 0;
//        while (num != 0) {
//            int rmd = num % 10;
//            rev = rev * 10 + rmd;
//            num = num / 10;
//        }
//        if (x == rev) 
//            return true;
//        return false;
	}}


