package Arraypractice;

public class arrayq20 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 9 }, { 5, 4, 3, 8 }, { 5, 4, 3, 5 }, { 6, 4, 3, 7 } };
		int sum = 0;
		int count = 0;
		for (int i = 1; i < a.length - 1; i++) {
			for (int j = 1; j < a[i].length - 1; j++) {
				sum = sum + a[i][j];
				count++;
			}
		}
		System.out.println("sum is " + sum);
		System.out.println("Avg " + sum / a.length);

	}

}
