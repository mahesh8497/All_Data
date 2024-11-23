package Arraypractice;
//second largest element 
public class arrayq8 {
	public static void main(String[] args) {
int[] a= {1,4,3,2,3,65,68};
//int max=Integer.MIN_VALUE;
//int max1=Integer.MIN_VALUE;
//for (int i = 0; i < a.length; i++) {
//	if(a[i]>max)
//		max=a[i];
//}
//for (int i = 0; i < a.length; i++) {
//	if(a[i]!=max && a[i]>max1)
//		max1=a[i];
//}
//System.out.println(max1);
//}}
// one Loop
int min1=Integer.MAX_VALUE;
int min2=Integer.MAX_VALUE;
int j=0;
for (int i = 0; i < a.length; i++) 
{
	if(a[i]<min1)
	{
		min1=a[i];
	}
	if(j<=i) // or  j<a.length
	{
		if(a[j]>min1 && a[j]<min2)
			min2=a[j];
		else
		{
			j++;
			i--;
		}
	}
	else
		j=0;
}
System.out.println(min1);
System.out.println(min2);

}

}

