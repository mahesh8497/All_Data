package ArraysPractice;

public class Arraysq6 {
//Write a program to find and display reverse of an array without using thirdvariable
	public static void main(String[] args) 
	{
		int[]a= {1,2,3,4,5};
		System.out.println("Given Array");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			i++;
			j--;
			
		}
		System.out.println("After Reverse");
		for (int j2 = 0; j2 < a.length; j2++) 
		{
		System.out.println(a[j2]+" ");	
		}
	}

}
