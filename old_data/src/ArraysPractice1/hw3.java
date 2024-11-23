package ArraysPractice1;

import java.util.Arrays;

public class hw3 {
//Write a program to remove a specific element from anarray (Variations)
	public static void main(String[] args) 
	{
		int[] a = { 1, 2, 3,2,4,2,1,4, 4 };

		ele(a);
	}
	public static void ele(int[] a) {
		int num = 4;
		int c = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] == num)
				c++;
		}
		System.out.println(c);
		int[] b = new int[a.length - c];
		int i = 0;
		int j = 0;
		while (i < a.length && j < a.length) 
		{
			if (a[i] != num)
			{
				b[j++] = a[i];
			}
			i++;
		}
		a = b;
		System.out.println(Arrays.toString(a));
	}


}
