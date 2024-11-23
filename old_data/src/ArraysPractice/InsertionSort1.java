package ArraysPractice;

import java.util.Arrays;

public class InsertionSort1 {

	public static void main(String[] args) {
		int[]a= {8,7,6,5,4,3,2,1};
		for (int i = 1; i < a.length; i++) {
	        int temp = a[i];
	        int j = i - 1;
	        while(j >= 0 && temp< a[j])
	        {
	            a[j+1] = a[j];
	            j--;
	        }
	        
	        a[j+1] = temp;
	    }
		System.out.println(Arrays.toString(a));
	}
	
	}


