package Arraypractice;

public class arrayq24 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
//System.out.println("Given array is= ");
//for (int i = 0; i < a.length; i++)
//{
//	System.out.print(a[i]+" ");
//}
//System.out.println();
		System.out.println("After rotate right side");
		int n = 0;
		while (n < 3)
		{
			int temp = a[a.length - 1];
			for (int i = a.length - 1; i > 0; i--) 
			{
				a[i] = a[i - 1];
			}
			a[0] = temp;
			System.out.println();
			for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i] + " ");
			}

			n++;
		}
	}

}
