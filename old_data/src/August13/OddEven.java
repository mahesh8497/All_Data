package August13;

import java.util.Arrays;

public class OddEven {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,0};
		System.out.println(Arrays.toString(a));		
		int evencount=0;
		int oddcount=0;
		for (int i = 0; i < a.length; i++) 
		{
		   if(a[i]%2==0)
			   evencount++;
		   else 
			   oddcount++;
		}
		int[] evenarray=new int[evencount];
		int[] oddarray=new int [oddcount];
		int evenIndex=0;
		int oddIndex=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
				evenarray[evenIndex++]=a[i];
			else
				oddarray[oddIndex++]=a[i];
		}
		System.out.println();
		System.out.println("Even array");
		for (int i = 0; i < evenarray.length; i++)
		{
			System.out.println(evenarray[i]+" ");
		}
		System.out.println("Odd Array");
		for (int i = 0; i < oddarray.length; i++)
		{
			System.out.println(oddarray[i]+" ");
		}
	}

}
