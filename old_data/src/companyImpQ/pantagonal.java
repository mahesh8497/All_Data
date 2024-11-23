package companyImpQ;

public class pantagonal {

	public static void main(String[] args) {
		
		int sum=0;
		int cnt=0;
		int temp=1;
		for (int i = 1; i <5; i++) 
		{
			sum=temp+4+(3*cnt);
			System.out.println(sum);
			temp=sum;
			cnt++;
		}

	}

}
