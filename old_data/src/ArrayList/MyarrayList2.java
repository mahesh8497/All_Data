package ArrayList;
public class MyarrayList2 {
	int[]a=new int[3];
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
		MyarrayList2 ele=new MyarrayList2();
		ele.add(1);
		ele.add(3);
		ele.add(2);
		ele.add(5);
		ele.add(6);
		ele.print();
	}

}
