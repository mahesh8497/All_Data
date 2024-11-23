package SpiralPattern;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int count=1;
		int count2=n*n+1;
		int diff=n-1;
		for (int i = 0; i < n; i++)
		{
			int temp=count2;
		for (int j = 0; j < 2*n; j++) 
		{
		if(j-i>=0 && j<n)
		{
			System.out.print(count++ +" ");
			
		}
		else if(j+i<2*n && j>=n)
		{
			System.out.print(temp++ +" ");
		}
		else
		{
			System.out.print(" ");
		}	
		}
		System.out.println();
		count2=count2-diff--;
	}
}
}