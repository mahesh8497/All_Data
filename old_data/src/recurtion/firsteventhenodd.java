package recurtion;

import java.util.Arrays;

public class firsteventhenodd {
//first even and then odd
	static int count=0;
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		evenodd(a,0,1);
		System.out.println(Arrays.toString(a));
	}
	private static void evenodd(int[] a, int i, int j) {
		if(a[i]%2!=0)
		{
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}
		if(j<a.length-1)
			j++;
		else
		{
			j=i+1;
			i++;
		}
		if(i<a.length-1)
			evenodd(a,i,j);
	}

}
