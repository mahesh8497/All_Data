package recurtion;

import java.util.Arrays;

public class q12replace {

	public static void main(String[] args) {
		int[] a= {3,4,5,6,4,3,4,5,3,4,3,4};
		myreplace(a,0);
		System.out.println(Arrays.toString(a));

		}
		private static void myreplace(int[] a, int i) {
			if(a[i]==3)
				a[i]=8;
			if(i<a.length)
				i++;
			if(i<a.length)
				myreplace(a, i);
			
		}
	}


