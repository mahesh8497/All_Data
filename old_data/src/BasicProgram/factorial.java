package BasicProgram;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
//		System.out.println("Enter the number");
//		int num=sc.nextInt();
//		int factorial=1;
//		for (int i = 1; i <= num; i++)
//		{
//		factorial=factorial*i;
//
//		}
//		System.out.println(factorial);
//		System.out.println("Enter the number");
//		double num=sc.nextInt();
//		double fact=1.0;
//		for (double i = 1; i <=num; i++) 
//		{
//		fact=fact*i;	
//		}
//		System.out.println(fact);
//	}
//
//}

		 
	  	       
int fact =1;			
	  	        int i=1;
	  	        System.out.println("enter number: ");
	  	        int num=sc.nextInt();
	  	        do {
	  	        	fact = fact*i;
	  	        	i++;
	  	        
	  	        }
	  	        while (i<=num);
	  	        	System.out.println("factorial of given number: "+fact);
	  	        
	  	        
	    }  
	}  