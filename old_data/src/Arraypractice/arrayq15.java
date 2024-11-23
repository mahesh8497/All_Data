package Arraypractice;

public class arrayq15 {
//Leaader Element in 
	public static void main(String[] args) {
int[] a= {12,2,1,4,7,5,4};
for (int i = 0; i < a.length; i++) 
{
	int count=0;
	for (int j =i+1; j < a.length; j++)
	{
		if(a[j]>a[i])
			count++;
	}
	
	if (count==0)
	{
		System.out.println(a[i]+" ");
	}
}
	}

}
