package ByRecursion;

import java.util.Arrays;

public class simple {
public static void main(String[] arg) {
	int[] a= {1,2,3,4,5,6};
	print(a,0);
	System.out.println(Arrays.toString(a));
}

private static void print(int[] a, int i) 
{
	if(i < a.length)
		i++;	
}

}
