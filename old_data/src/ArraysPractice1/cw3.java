package ArraysPractice1;

import java.util.Arrays;

public class cw3 {
	//selection Sort
	public static void main(String[] args) {
		int[]a= {6,5,3,2,4,1,7};
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
		for (int j = i+1; j < a.length; j++)
		{
			if(a[j]<a[min])
				min=j;
		}	
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
