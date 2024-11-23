package ArrayList;

public class MyArrayList1 {
	int[]a=new int[5];
	int index=0;
	public void add(int num)
	{
		if(index>=a.length)
		{
			int[]b=new int[(int)(1.75*a.length)];
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
		System.out.println(a[i]+" ");	
		}
	}
	public static void main(String[] args) {
		MyArrayList1 a=new MyArrayList1();
		a.add(1);
		a.add(12);
		a.add(4);
		a.add(4);
		a.add(5);
		a.add(5);
		a.add(5);
		a.print();
	}
}
