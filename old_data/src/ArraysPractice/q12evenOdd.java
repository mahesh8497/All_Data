package ArraysPractice;

import java.util.Iterator;

public class q12evenOdd {

	public static void main(String[] args) 
	{
		int[]a= {1,2,3,4,5,6,7,8};
		int ec=0;
		int oc=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
				ec++;
			else
				oc++;
		}	
		int[]evenArray=new int[ec];
		int[]oddArray=new int[oc];
		int evenindex=0;
		int oddindex=0;
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
		if(a[i]%2==0)
			evenArray[evenindex++]=a[i];
		else
			oddArray[oddindex++]=a[i];
		}
		System.out.println();
		System.out.println("EvenArray");
		for (int i = 0; i < evenArray.length; i++) 
		{
			System.out.println(evenArray[i]+" ");
		}
		System.out.println("oddArray");
		for (int i = 0; i < oddArray.length; i++) 
		{
		System.out.println(oddArray[i]+" ");	
		}
	
}

}
