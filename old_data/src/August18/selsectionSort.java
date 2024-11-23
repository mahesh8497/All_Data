package August18;

import java.util.Arrays;

public class selsectionSort {

	public static void main(String[] args) {
		int[]a= {8,6,7,5,4,3,2,1};
		for (int i = 0; i < a.length; i++) 
		{
			int max=i;
		for (int j = i+1; j < a.length; j++) 
		{
		if(a[j]>a[max])
			max=j;
		}	
		int temp=a[i];
		a[i]=a[max];
		a[max]=temp;
		
		}
		System.out.println(Arrays.toString(a));
	}

}
