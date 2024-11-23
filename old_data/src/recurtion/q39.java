package recurtion;

import java.util.Arrays;

public class q39 {

	public static void main(String[] args) {
		int[] a= {5,1,3,6,8,2,9,0,10};
		int inEle=0;
		int decEle=0;
		if(a[0]>a[1])
		{
			decEle=a[0];
			inEle=a[1];
		}
		else
		{
			decEle=a[1];
			inEle=a[0];
		}
		int incount=getcount(inEle,a,2,1);
		System.out.println(incount);
		int incArr[]=new int[incount];
		int decArr[]=new int[a.length-incount];
		int incIndex=1;
		int decIndex=1;
		inEle=0;
		decEle=0;
		if(a[0]>a[1])
		{
			decEle=a[0];
			decArr[0]=a[0];
			inEle=a[1];
			incArr[0]=a[1];
		}
		else
		{
			decEle=a[1];
			decArr[0]=a[1];
			inEle=a[0];
			incArr[0]=a[0];
		}
		for (int i =2; i < a.length; i++)
		{
			if(inEle<a[i])
			{
				inEle=a[i];
				incArr[incIndex++]=a[i];
			}
			else if(decEle>a[i])
			{
				decEle=a[i];
				decArr[decIndex++]=a[i];
			}
			else
			{
				System.out.println("no sequence");
			}
		}
		System.out.println(Arrays.toString(incArr));
		System.out.println(Arrays.toString(decArr));
	}

	private static int getcount(int inEle, int[] a, int i, int j) 
	{
		if(inEle<a[i])
		{
			inEle=a[i];
			j++;
		}
		i++;
		if(i<a.length)
			return getcount(inEle,a,i,j);
		return j;
		//return 0;
	}

}
