package ArraysPractice;

public class binarySearch {
	public static void main(String[]args)
	{
		int[]a= {1,2,3,4,5,6};
		int s=0;
		int e=a.length-1;
		int mid=0;
		int num=12;
		while(s<=e)
		{
			mid=(s+e)/2;
			if(num==a[mid])
			{
				System.out.println("Element found "+mid);
			break;
			}
			else if(num<a[mid])
			{
				e=mid-1;
			}
			else
				s=mid+1;
				
		}
		if(s>e)
		{
			System.out.println("Not found");
		}
	}

}
