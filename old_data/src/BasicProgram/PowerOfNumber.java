package BasicProgram;
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sq=0;
		for (int i = 0; i < num; i++) 
		{
		sq=sq+num;	
		}
		System.out.println(sq);
		
		
		/*second way
		System.out.println();
		System.out.println(Math.pow(2, 2)+" using math pow");
		
		
		
		//3rd way
		System.out.println();
		int n=2;
		int c=n*n;
				System.out.println(c);*/
		System.out.println(Math.pow(4, 2));
	}

}
