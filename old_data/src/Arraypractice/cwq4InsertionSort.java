package Arraypractice;

public class cwq4InsertionSort {
//Insertion Sort
	public static void main(String[] args) {
//int[] a= {5,3,6,7,8,2,1,0};
//for (int i = 0; i < a.length; i++) 
//{ 
//	int start=0;
//	int end=i;
//	for (int j = i-1; j>0; j--)
//	{
//	if(a[j]<a[i])
//	{
//		start=j+1;
//		break;
//	}
//	}
//	int temp=a[end];
//	for (int j =end; j>start; j--)
//	{
//		a[j]=a[j-1];
//	}
//	a[start]=temp;
//}
//System.out.println("Sorted array");
//for (int i = 0; i < a.length; i++)
//{
//	System.out.print(a[i]+" ");
//}
//		int[] a= {3,4,5,5,6,78,9};
//		for (int i = 0; i < a.length; i++) 
//		{
//		int start=0;
//		int end=i;
//        for (int j =i-1; j>=0; j--)
//		{
//		if(a[j]<a[i])
//		{
//			start=j+1;
//			break;
//			}
//		}
//		int temp=a[end];
//		for (int j =end ; j>start; j--)
//		{
//			a[j]=a[j-1];
//		}
//	 a[start]=temp;	
//}
//		System.out.println("Sorted array ");
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.println(a[i]+" ");
//		}
//		
		
		
		
		
		int[] a= {5,4,7,4,8,9,5,6};
		for (int i = 0; i < a.length; i++) 
		{
			int start=0;//start with initial value
			int end=i;
			for (int j =i-1; j>=0; j--) //j start with i-1
			{
				if(a[j]<a[i])
				{
					start=j+1;
					break;
				}
			}
			int temp=a[end];//store the end value in temp variable
            for (int j = end; j>start; j--) 
            {
				a[j]=a[j-1];
			}			
            a[start]=temp;//store the temp value in start
		}
		for (int i = 0; i < a.length; i++)
		{
		System.out.println(a[i]+" ");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
