package recurtion;

import java.util.Arrays;
//first negetive then positive

public class q4 {

	public static void main(String[] args) {
		int[] a= {4,-5,3,2,-7,-6,-9};
		firstnegetive(a,0,0);
		System.out.println(Arrays.toString(a));
	}

	private static void firstnegetive(int[] a, int i, int j) {
		if(j<a.length-1)
			j++;
		else
		{
			j=0;
			i++;
		}
		if(i<j && a[i]>0 && a[j]<0)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		if(i<a.length)
			firstnegetive(a,i,j);
			
	}

}
