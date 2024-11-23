package Arraypractice;

import java.util.Arrays;

public class arrayq12 {

	public static void main(String[] args) {
		int[] a = { 11, 2, 3, 24, 5, 6, 7, 8, 91, 0 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int oddcount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0)
				oddcount++;
		}
		int[] r = new int[oddcount];
		int oddIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0)
				r[oddIndex++] = a[i];
		}
		System.out.println(
				
				);
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r.length; j++) {
				if (r[i] < r[j]) {
					int temp = r[i];
					r[i] = r[j];
					r[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(r));
		System.out.println(r[r.length - 1] + " Max Odd Number");

	}

}
