package August13;
//max and min in array
public class maxEle {

	public static void main(String[] args) {
		
		int[] a= {12,3,2,34,55,5,67,7,8,9,9,9,67};
		//int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
		{
		//if(a[i]>max)
			//max=a[i];
			if(a[i]<min)
				min=a[i];
		}
			//System.out.println(max+" ");
		System.out.println(min);
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
		if(a[i]>max)
		max=a[i];
	}
		System.out.println(max);
		System.out.println("diff "+(max-min));
}
}