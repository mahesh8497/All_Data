package ArraysPractice;

import java.util.Arrays;

//Write a program to copy an array by iterating thearray.
public class Arraysq4 {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		System.out.println("Given array");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(Arrays.toString(a));
			break;
		}
		int[]b=new int[a.length];
		for (int i = 0; i < a.length; i++)
		{
			b[i]=a[i];
		}
		System.out.println("coppy Array ");
		for (int i = 0; i < b.length; i++) 
		{
		System.out.print(b[i]+" ");	
		}
		

	}

}
