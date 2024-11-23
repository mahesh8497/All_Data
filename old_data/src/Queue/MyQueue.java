package Queue;

public class MyQueue
{
	int[]a= new int[1];
	int index=0;
	public void set(int num)
	{
		if(index>=a.length)
		{
			int[]b=new int[2*a.length];
			for (int i = 0; i < a.length; i++)
			{
			b[i]=a[i];	
			}
			a=b;
		}
		a[index++]=num;
	}
	public int get()
	{
		int num=a[0];
		for (int i = 0; i < a.length-1; i++)
		{
		a[i]=a[i+1];
		}
		index--;
		return num;
		
	}
}
