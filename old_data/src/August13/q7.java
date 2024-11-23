package August13;

import java.util.Arrays;

public class q7 {

	public static void main(String[] args) {
		int[]a= {0,2,0,4,0,6,7,12};
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
		}
		System.out.println(Arrays.toString(a));
	}

}
