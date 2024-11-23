package recurtion;

import java.util.Arrays;

public class rotaterightside {
//element rotate right side
	public static void main(String[] args) {
		int[] a= {1,7,5,1,2,3,4,6,9,1,2,5};
		myleft(a,0);
		System.out.println(Arrays.toString(a));

		}

		private static void myleft(int[] a, int i) {
			int temp=a[i];
			a[i]=a[a.length-1];
			a[a.length-1]=temp;
			
			if(i<a.length)
				i++;
			if(i<a.length)
				myleft(a, i);
			
		}
	}


