package August20;

import java.util.Arrays;

public class q39 {

	public static void main(String[] args) {
		int[]a= {6,4,8,5,7,2,1};
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
		System.out.println("Incresing Array");
		System.out.println(Arrays.toString(IncArr));
		System.out.println("Decreasing ARRAY");
		System.out.println(Arrays.toString(decArr));
	}

}
