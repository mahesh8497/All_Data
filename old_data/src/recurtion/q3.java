package recurtion;

import java.util.Arrays;
//Sorting
public class q3 {
	public static void main(String[] args) {
		int[] a= {7,6,5,4,3,2,1};
		sort(a,0,0);
		System.out.println(Arrays.toString(a));
}

private static void sort(int[] a, int i, int j) {
if(i<j && a[i]>a[j])
{
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
if(j<a.length-1)
	j++;
else
{
	j=0;
	i++;
}
if(i<a.length)
	sort(a,i,j);
}

}
