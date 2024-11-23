package August13;

import java.util.Arrays;

public class replace {

	public static void main(String[] args) {
		int[] a= {1,0,68};
		for (int i = 0; i < a.length; i++)
		{
		if(a[i]==0)
			a[i]=1;
		}
		System.out.println(Arrays.toString(a));
	}

}
