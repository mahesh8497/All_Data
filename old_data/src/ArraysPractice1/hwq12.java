package ArraysPractice1;

public class hwq12 {
//Write a program to put even and odd elements of array in two separate arrays. (Variations)

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9};
		int ec=0;
		int oc=0;
		for (int i = 0; i < a.length; i++)
		{
		if(a[i]%2==0)
			ec++;
		else
			oc++;
		}
		int[] ea=new int[ec];
		int[]oa=new int[oc];
		int ei=0;
		int oi=0;
		for (int i = 0; i < a.length; i++)
		{
		if(a[i]%2==0)
			ea[ei++]=a[i];
		else
			oa[oi++]=a[i];
		}
		System.out.println();
		System.out.println("Even Array");
		for (int i = 0; i < ea.length; i++)
		{
		System.out.println(ea[i]+" ");	
		}
		System.out.println("odd Array");
		for (int i = 0; i < oa.length; i++) 
		{
		System.out.println(oa[i]+" ");	
		}
	}

}
