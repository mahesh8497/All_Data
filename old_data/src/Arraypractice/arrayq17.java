package Arraypractice;

public class arrayq17 {

	public static void main(String[] args) {
int[] a= {1,0,2,0,5,0,0,7,9,0};
System.out.println("Given Array");
for (int i = 0; i < a.length; i++)
{
	System.out.print(a[i]+" ");
	
}
System.out.println();
System.out.println("After replacing 0 by 1");
for (int i = 0; i < a.length; i++) 
{
	if(a[i]==0)
		a[i]=1;
}
for (int i = 0; i < a.length; i++) 
{
System.out.print(a[i]+" ");	
}
System.out.println();
	}

}
