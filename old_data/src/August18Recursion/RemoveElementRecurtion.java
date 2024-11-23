package August18Recursion;

import java.util.Arrays;

public class RemoveElementRecurtion {
	 static int[]a= {1,2,3,4,5,6,7};
	static int num=4;
	static int i=0;
	static int[]b=new int[a.length-1];
	static int index=0;
	public static void main(String[] args) 
	{
	print();
	System.out.println(Arrays.toString(b));
	}
	private static void print() 
	{
		if(a[i]!=num)
			b[index++]=a[i];
		i++;
		if(i < a.length)
			print();
	}

}
