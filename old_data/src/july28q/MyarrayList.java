 package july28q;

public class MyarrayList
{
	int index=0;
	int size=5;
	int[] a=new int[size];
	public MyarrayList() //by default array we create 
	{
	}
	public MyarrayList(int size)
	{
		a=new int[size];
	}
	void add(int num)//take add method
	{
		if(index>=a.length)
		{
			System.out.println("create new array");
			int size=(int)(a.length*1.75);
			int[] b=new int[size];
			for (int i = 0; i < a.length; i++) 
			{
				
				b[i]=a[i];
			}
			a=b;
		}
		a[index++]=num;
		
	}
	void print()
	{
		for (int i = 0; i < index; i++) 
		{
			System.out.println(a[i]+" ");
		}
	}

}
