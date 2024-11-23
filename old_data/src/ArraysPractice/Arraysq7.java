package ArraysPractice;

import java.util.Arrays;

public class Arraysq7 {
//) Write a program sort array elements in ascending order using bubble sort.

	public static void main(String[] args)
	{
		int[]a= {7,6,5,4,3,2,1};
		 boolean sorted = false;
		    int temp;
		    while(!sorted) 
		    {
		        sorted = true;
		        for (int i = 0; i < a.length - 1; i++) 
		        {
		            if (a[i] > a[i+1]) 
		            {
		                temp = a[i];
		                a[i] = a[i+1];
		                a[i+1] = temp;
		                sorted = false;
		            }
		        }
		    }
		    System.out.println(Arrays.toString(a));
	}}
