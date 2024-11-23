package companyImpQ;

public class PairElement {

	public static void main(String[] args)
	{
		int[] a = { 1, 1, 2 };
		System.out.println("Given Array is ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
		int count = 0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] == a[j])
				{
					count++;
					break;
				}

			}
		}
		System.out.println();
		System.out.println("Duplicate element is= " + count);
		int index = 0;
		System.out.println("After duplicate element remove");
		int[] b = new int[a.length - count];
		for (int i = 0; i < a.length; i++)
		{
			int rank = 1;
			for (int j = 0; j < i; j++) 
			{
				if (a[i] == a[j])
					rank++;
			}
			if (rank == 1) {
				b[index++] = a[i];
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("pair element is");
		// pair of the element logic
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) 
			{
				System.out.println(b[i] + " " + b[j]);
			}
		}
	}

}
