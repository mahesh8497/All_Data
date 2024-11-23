package recurtion;

import java.util.Arrays;

public class q16reverseArray {
//reverse array
	public static void main(String[] args) {
		int[] a= {1,7,5,4,68,9};
		rev(a,0);
		System.out.print(Arrays.toString(a));

	}

	private static void rev(int[] a, int i) {
		int temp=a[i];
	a[i]=a[a.length-1-i];
	a[a.length-1-i]=temp;
	if(i<a.length/2)
		i++;
	if(i<a.length/2)
		rev(a, i);
		
	}

}
