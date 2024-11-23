package Arraypractice;

import java.util.*;

public class arrayq24ratateleftside {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the Array size");
//	int num=sc.nextInt();
//	int[]a=new int[num];
//	for (int i = 0; i <num; i++) 
//	{
//	a[i]=sc.nextInt();	
//	}
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(a));
		int n = 0;
		System.out.println("Enter the rotate times");
		int m = sc.nextInt();
		while (n < m) 
		{
			int temp = a[0];
			for (int i = 0; i<a.length - 1; i++) 
			{
				a[i] = a[i + 1];
			}
			a[a.length - 1] = temp;
			n++;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}

	}

}
