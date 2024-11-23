package Arraypractice;

public class arrayq16 {

	public static void main(String[] args) {
int[] a= {1,2,3,4,5,7,56};
//int min=Integer.MAX_VALUE;
//int max=Integer.MIN_VALUE;
//for (int i = 0; i < a.length; i++)
//{
//	for (int j = 0; j < a.length; j++) 
//	{
//	if(a[i]>max)
//		max=a[i];
//	if (a[i]<min)
//		min=a[i];
//	}
//}
//System.out.println(max);
//System.out.println(min);
//System.out.println("The difference is  "+(max-min));
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		if(i<j&& a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
System.out.println(a[0]+" =minimum");
System.out.println(a[a.length-1]+" =maximum");
System.out.println(a[a.length-1]-a[0]+"= diff");


	}

}
