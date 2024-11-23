package August19;

public class InsertionSort {

	public static void main(String[] args) {
		int[]a= {6,4,3,2,1};

		for (int i = 0; i < a.length; i++) 
		{
		int temp=a[i];
		for (int j = i-1; j >=0; j--) 
		{
			if(a[j]>temp)
			{
				a[j+1]=a[j];
			}
			else 
			{
				a[j+1]=temp;
				break;
			}
			if(j==0)
				a[0]=temp;
		}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}

}
