package Arraypractice;


public class arrayq7BubbleSort {

	public static void main(String[] args) {
int[] a= {5,3,2,4,1};
System.out.println("After bubble sorting");


for (int i = 0; i < a.length; i++)
{
	for (int j =0; j < a.length-1; j++) 
{
	if(a[j]>a[j+1])
	{
		int temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
	}
}
	
}
for (int i = 0; i < a.length; i++)
{
System.out.print(a[i]+" ");	
}
	}

}

/*int[] a= {5,4,6,3,1,2};
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length-1;j++)
	{
		if(a[j]>a[j+1])
		{
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}
	}
}
For(int i=0;i<a.length;i++)
{
	System.out.println(a[i]+" ");
}
*/