package companyImpQ;

public class primeNumber {

	public static void main(String[] args) {

		int n=12;
		boolean prime=true;
		int i = 2;
		for (; i <= n/2; i++)
		{
			if(n%i==0)
			{
				prime=false;
				break;
			}
		}
		System.out.println(prime);
//		int num=123;
//		boolean prime=true;
//		int i = 2;
//		for (; i <=num/2; i++) 
//		{
//		if(num%i==0)
//		{
//			prime=false;
//			break;
//		}
//		}
//		System.out.println(prime);
	}

}
