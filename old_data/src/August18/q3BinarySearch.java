package August18;

public class q3BinarySearch {

	public static void main(String[] args) {
		int[]a= {1,3,4,5,6,7,8,9,11};
		int num=1;
		int s=0;
		int e=a.length-1;
		while(s<=e)
		{
			int min=(s+e)/2;
			if(a[min]==num)
			{
				System.out.println("number found at index "+min);
				break;
			}
			else if(num>a[min])
				s=min+1;
			else
				e=min-1;
		}
		if(s>e)
		{
			System.out.println("not found");
		}
	}

}
