package recurtion;

public class removespnumb {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7,7,7,7,7,6434, };
		int num = 7;
		removespelem(a, 0, num);
	}

	private static void removespelem(int[] a, int i, int num) {
		if (i < a.length) {
			if (a[i] != num) 
			{
				System.out.println(a[i]);
			}
		}
		if (i < a.length) {
			removespelem(a, ++i, num);
		}
	}


}
