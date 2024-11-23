package Arraypractice;

import java.util.Scanner;

public class Q2CWbinaryserch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,4,5,6};
		int s=0;
		int e=a.length-1;
		int mid=0;
		int num=34;
		while(s<=e)
		{
			mid=(s+e)/2;
			if(num==a[mid])
			{
				System.out.println("Element found "+mid);
			break;
			}
			else if(num<a[mid])
			{
				e=mid-1;
			}
			else
				s=mid+1;
				
		}
		if(s>e)
		{
			System.out.println("Not found");
		}
	}
}