package ArraysPractice1;

public class hw4 {
//Write a program to copy an array by iterating thearray.
	public static void main(String[] args) {
		int[]a= {1,2,3,4};
		System.out.println("Given Array");
		for (int i = 0; i < a.length; i++) 
		{
		System.out.println(a[i]+" ");	
		}
		System.out.println();
		int[]b=new int [a.length];
		for (int i = 0; i < b.length; i++)
		{
			b[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
		System.out.println(b[i]+" ");	
		}
	}

}
