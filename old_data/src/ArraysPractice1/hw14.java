package ArraysPractice1;

public class hw14 {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b= {1,2,3,4,5};
		if(a.length==b.length)
		{
			int count=0;
			for (int i = 0; i < b.length; i++)
			{
			if(a[i]!=b[i])
				count++;
			}
			System.out.println("The different element in array is "+count);
			if(count==0)
				System.out.println("same");
			else
				System.out.println("not same");
			}
		}
	}

