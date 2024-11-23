package Arraypractice;

import java.util.Arrays;

public class q39withSingleLoop {

	public static void main(String[] args) {
		int a[]= {5,1,3,6,8,2,9,0,10};
		int inel=0,deel=0;
		if(a[0]>a[1])
		{
			deel=a[0];//decrease element
			inel=a[1];//increase element
		}
		else
		{
			deel=a[1];
			inel=a[0];
		}
		int incount=getcount(inel,a,2,1);		
		System.out.println(incount);
		int inar[]=new int[incount];//increase array
		int dear[]=new int[a.length-incount];//decrease array
		int inindex=1,deindex=1;
		inel=0;deel=0;
		if(a[0]>a[1])
		{
			deel=a[0];
			dear[0]=a[0];
			inel=a[1];
			inar[0]=a[1];
		}
		else
		{
			deel=a[1];
			dear[0]=a[1];
			inel=a[0];
			inar[0]=a[0];
		}
		for (int i = 2; i < a.length; i++) 
		{
			if(inel<a[i])
			{
				inel=a[i];
				inar[inindex++]=a[i];
			}
			else if(deel>a[i])
			{
				deel=a[i];
				dear[deindex++]=a[i];
			}
			else
			{
				System.out.println("no such sequence");
			}
		}
		System.out.println(Arrays.toString(inar));
		System.out.println(Arrays.toString(dear));
	}
	private static int getcount(int inel, int[] a, int i, int j) 
	{
		if(inel<a[i])
		{
			inel=a[i];
			j++;
		}
		i++;
		if(i<a.length)
			return getcount(inel, a, i, j);
		return j;

	}

}
