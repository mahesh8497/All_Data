package ArraysPractice;

import java.util.Iterator;

public class Arraysq8 {

	public static void main(String[] args) {
		int[]a= {11,23,311,4,15,16,57,8};
//		int max=Integer.MIN_VALUE;
//		int max1=Integer.MIN_VALUE;
//		for (int i = 0; i < a.length; i++)
//		{
//			if(a[i]>max)
//				max=a[i];
//		}
//		for (int i = 0; i < a.length; i++)
//		{
//		if(a[i]!=max&& a[i]>max1)
//			max1=a[i];
//		}
//		System.out.println("maximum element "+max);
//		System.out.println("second maximum element "+max1);
		int max=Integer.MIN_VALUE;
		int max1=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
		if(a[i]>max)
			max=a[i];
		}
		for (int i = 0; i < a.length; i++) 
		{
		if(a[i]!=max&&a[i]>max1)
			max1=a[i];
		}
		System.out.println("first max "+max+"\n"+max1+" second max");
		//System.out.println("second max "+max1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
