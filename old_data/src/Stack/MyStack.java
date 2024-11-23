package Stack;

public class MyStack 
{	
	int[]a=new int[4];
	int index=0;
	public void push(int num)
	{
		try {
			a[index]=num;
			index++;
		} catch (Exception e)
		{
			System.out.println("stack full");
			// TODO: handle exception
		}
//		if(index<a.length)//check the index if index is gretter then goes to else
//		{
//			a[index++]=num;//add the number 
//		}
//		else
//		{
//			int[]b=new int [a.length+1];
//			for (int i = 0; i < a.length; i++) 
//			{
//			b[i]=a[i];	
//			}
//			a=b;
//			a[index++]=num;
//		}
			//System.out.println("stack full");
	}
	public int pop()
	{
		try {
			index--;
			int num=a[index];
			a[index]=0;
			return num;
		} catch (Exception e) 
		{
			System.out.println("stack empty");
			// TODO: handle exception
		}
//		if(index>=1)
//		{
//			index--;
//			int num=a[index];
//			a[index]=0;
//			return num;
//		}
//		else
//			System.out.println("stack empty");
		return 0;
	}
	public void print()
	{
		
	}

}
