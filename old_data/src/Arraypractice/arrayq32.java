package Arraypractice;

public class arrayq32 {

	public static void main(String[] args) {
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
		for (int j = 0; j < a.length; j++)
		{
		if(j==i)
			sum=sum+a[i][j];//only one diagonal 1,5,9
		}	
		}
		System.out.println(sum);
	}

}
