package companyImpQ;
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int sum=0;
		for (int i = 1; i <n; i++) 
		{
		if(n%i==0)
		{
			sum+=i;
		}
		}
		if(sum==n)
			System.out.println(n+" Perfect Number");
		else
			System.out.println(n+" Not perfect Number");

	}

}
