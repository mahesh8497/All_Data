package ArraysPractice1;

import java.util.Arrays;

public class cw5 {
//Write a program to arrange the elements of an given array of integers where all positive integers appear before all 
	//the negative integers. (Variations
	public static void main(String[] args) {
		int[]a= {3,4,-3,2-1};
		for (int i = 0; i < a.length; i++) 
		{
		for (int j = i+1; j < a.length; j++) 
		{
		if(a[i]<=0)
		{
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}
		}	
		}
		System.out.println(Arrays.toString(a));
	}

}
