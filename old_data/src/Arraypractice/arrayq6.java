package Arraypractice;

public class arrayq6 {
//reverse array without third variable
	public static void main(String[] args) {
int[] a= {1,2,3,4,5};

int i=0,j=a.length-1;
while(i<j)
{
	a[i]=a[i]+a[j];
	a[j]=a[i]-a[j];
	a[i]=a[i]-a[j];
	i++;j--;
}
System.out.println("Reverse Array");
for (int k = 0; k < a.length; k++) 
{
	System.out.print(a[k]+" ");

}
	}

}
