package Arraypractice;

public class CWq5positiveNegetive {

	public static void main(String[] args) {
int[] a= {1,5,7,9,6,-4,2,-3,-2,-9};
int pcount=0;
int ncount=0;
for (int i = 0; i < a.length; i++)
{
	if (a[i]>0)
		pcount++;
	else
		ncount++;
}
int[] parray=new int[pcount];
int[] narray=new int[ncount];
int pIndex=0;
int nIndex=0;
for (int i = 0; i < a.length; i++) 
{
	if (a[i]>0)
		parray[pIndex++]=a[i];
	else
		narray[nIndex++]=a[i];
}
System.out.println("Positive array");
for (int i = 0; i < parray.length; i++)
{
System.out.print(parray[i]+" ");	
}
System.out.println();
System.out.println("Negetive Array");
for (int i = 0; i < narray.length; i++)
{
	System.out.print(narray[i]+" ");
}
	}

}
