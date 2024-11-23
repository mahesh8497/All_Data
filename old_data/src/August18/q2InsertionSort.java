package August18;

import java.util.Arrays;
//Insertion Sort
public class q2InsertionSort {

	public static void main(String[] args) {
		int[]a= {5,6,3,2,1,4};
		for (int i = 1; i < a.length; i++)
		{
			for (int j = i; j >=1; j--)
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
				else
					break;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
