package companyImpQ;
import java.util.Arrays;
public class q2DuplicateElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 1 };
		int count = 0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < i; j++) 
			{
				if (a[i] == a[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println(count+" count");
		int[] b = new int[a.length - count];
		int index = 0;
		for (int i = 0; i < a.length; i++) 
		{
			int rank = 1;
			for (int j = 0; j < i; j++) 
			{
				if (a[i] == a[j])
					rank++;
			}
			if (rank <= 1) {
				b[index++] = a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + "");
		}
	}

}
