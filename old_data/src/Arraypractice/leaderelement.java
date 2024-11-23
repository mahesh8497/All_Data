package Arraypractice;
public class leaderelement {
	public static void main(String[] args) {
int[] a= {1,8,6,4,3,7,4};
for (int i = 0; i < a.length; i++) 
{
	System.out.println(a[i]+" ");
}
for (int i = 0; i < a.length; i++)
{
	int count=0;
	for (int j =i+1; j < a.length; j++) 
	{
		if(a[j]>a[i])
			count++;
	}
	if (count==0)
		System.out.print(a[i]+" ");
}
	}

}
