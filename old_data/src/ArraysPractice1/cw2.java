package ArraysPractice1;

public class cw2 {
//Write a program to perform binary search.
	public static void main(String[] args) {
		int[] a= {7,6,5,4,3,2,1};
		int num=4;
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(a[mid]==num)
			{
				System.out.println("present at index "+mid);
				break;
			}
			else if(num<a[mid])
				start=mid+1;
			else
				end=mid-1;
			if(start<end)

			{
				System.out.println("not found");
				break;
			}
		}
		}
	}