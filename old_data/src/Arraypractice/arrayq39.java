package Arraypractice;

import java.util.Arrays;

public class arrayq39 {

	public static void main(String[] args) {
		int[]a= {5, 1, 3, 6, 8, 2, 9, 0, 10};
		int IncNo=0;
		int decNo=0;
		if(a[0]>a[1]) 
		{
			decNo=a[0];
			IncNo=a[1];
		}
		else
		{
			decNo=a[1];
			IncNo=a[0];		
		}
		int incArraySize=1;
		int decArraySize=1;
		for (int i = 2; i < a.length; i++)
		{
		if(a[i]>IncNo)
		{
			IncNo=a[i];
			incArraySize++; 
		}
		else if(a[i]<decNo)
		{
			decNo=a[i];
			decArraySize++;
		}
		else
		{
			System.out.println(-1);
			System.out.println("No sequence of given Array");
			System.exit(0);
		}
		}
		//Logic for Index
		int[]IncArr=new int[incArraySize];
		int[]decArr=new int[decArraySize];
		int incInd=0;
		int decInd=0;
		if(a[0]>a[1])
		{
			decArr[decInd++]=a[0];
			IncArr[incInd++]=a[1];
			decNo=a[0];
			IncNo=a[1];
		}
		else
		{
			decArr[decInd++]=a[1];
			IncArr[incInd++]=a[0];
			decNo=a[1];
			IncNo=a[0];
		}
		for (int i =2; i <a.length; i++) 
		{
		if(a[i]>IncNo)
		{
			IncNo=a[i];
			IncArr[incInd++]=a[i];
		}
		else
		{
			decNo=a[i];
			decArr[decInd++]=a[i];
		}
		}
		System.out.println("increasing array");
		System.out.println(Arrays.toString(IncArr));
		System.out.println("Decreasing Array");
		System.out.println(Arrays.toString(decArr));
	}
}

		/*
		int[] a= {6,4,8,4,3,2,5,7,8,9,5,4,1};
		int[] increase=new int[a.length];
		int[] decrease=new int[a.length];
		if(a[0]>a[1])
		{
			increase[0]=a[1];
			decrease[0]=a[0];
		}
		else
		{
			increase[0]=a[0];
			decrease[0]=a[1];
		}
		int increaseIndex=1;
		int decreaseIndex=1;
		for (int i = 2; i < a.length; i++)
		{
			if(a[i]>increase[increaseIndex-1])
			{
				increase[increaseIndex++]=a[i];
			}
			else if(a[i]<decrease[decreaseIndex-1])
			{
				decrease[decreaseIndex++]=a[i];
			}
//			else
//			{
//				System.out.println("-1\nNo Such sequence possible");
//			}
			}
		System.out.println("Strictly increassing sequence :");
		for (int i = 0; i < increaseIndex; i++) 
		{
			System.out.print(increase[i]+" ");
		}
		System.out.println();
		System.out.println("Strictly decreassing sequence :");
		for (int i = 0; i < decreaseIndex; i++) 
		{
			System.out.print(decrease[i]+" ");
		}
		*/
		/*int[]a= {1,28,67,5,4,3,24,15,67,7,12,86,0,6,54,33,45,4,34};
		int[] increase=new int[a.length];
		int[] decrease=new int[a.length];
		if(a[0]>a[1])
		{
			increase[0]=a[1];
			decrease[0]=a[0];
		}
		else 
		{
			increase[0]=a[0];
			decrease[0]=a[1];
		}
		int incraseIndex=1;
		int decreaseIndex=1;;
		for (int i = 2; i < a.length; i++) 
		{
			if(a[i]>increase[incraseIndex-1])
			{
				increase[incraseIndex++]=a[i];
			}
			else if(a[i]<decrease[decreaseIndex-1])
			{
				decrease[decreaseIndex++]=a[i];
			}
		}
		System.out.println("Increasing Order");
		for (int i = 0; i <incraseIndex; i++) 
		{
		System.out.println(increase[i]+" ");	
		}
			System.out.println();
			System.out.println("Decreasing Order");
		for (int i = 0; i < decreaseIndex; i++) 
		{
			System.out.println(decrease[i]+" ");
		}
	}

}
*/
		
		//		for (int i = 0; i < IncArr.length; i++) 
//		{
//		System.out.println("Increase Array "+IncArr[i]);	
//		}
//		for (int i = 0; i < decArr.length; i++)
//		{
//		System.out.println("Decrease Array "+decArr[i]);	
//		}
		
		
		
		
		
		
		
		
		
