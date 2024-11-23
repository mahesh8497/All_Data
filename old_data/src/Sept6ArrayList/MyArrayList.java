package Sept6ArrayList;

public class MyArrayList {
	int[]a=new int[2];
	int index=0;
	public void add(int num)
	{
		if(index>=a.length)
		{
			int[] b=new int[(int)(1.75*a.length)];
			for (int i = 0; i < a.length; i++)
			{
			b[i]=a[i];	
			}
			a=b;
		}
		a[index++]=num;
	}
	public void print()
	{
		for (int i = 0; i < index; i++) 
		{
		System.out.print(a[i]+" ");
		}
	}
	void remove(int j)
	{
		if(j<index)
		{
			for (int i = j; i <index-1; i++) 
			{
			a[i]=a[i+1];	
			}
			index--;
		}
	}
	public String toString()
	{
		String s="";
		for (int i = 0; i <index; i++) 
		{
			s=s+a[i]+" ";
			System.out.println();
		}
		return s;
	}
	public static void main(String[] args)
	{
		MyArrayList list=new MyArrayList();
		list.add(12);
		list.add(10);
		list.add(98);
		list.add(56);
		list.add(44);
		//list.toString();
		//list.remove(1);
		list.print();
	}
}
