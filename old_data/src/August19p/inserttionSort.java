package August19p;

public class inserttionSort {

	public static void main(String[] args) {
		int[]a= {5,3,5,6,8,9,2,1,4};
		/*
		for (int i = 1; i < a.length; i++) 
		{
		int temp=a[i];
		for (int j = i-1; j >=0; j--) 
		{
		if(a[j]>temp)
			a[j+1]=a[j];
		
		else
		{
			a[j+1]=temp;
			break;
		}
		if(j==0)
			a[0]=temp;
		}
	}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("**********************");
		*/
		for (int i = 1; i < a.length; i++) 
		{
		int temp=a[i];
		for (int j = i-1; j>=0; j--) 
		{
			if(a[j]>temp)
				a[j+1]=a[j];
			else
			{
				a[j+1]=temp;
				break;
			}
			if(j==0)
				a[0]=temp;
		}
		}
		for (int i = 0; i < a.length; i++) 
		{
		System.out.println(a[i]+" ");	
		}
		
		
		
		
}
}
