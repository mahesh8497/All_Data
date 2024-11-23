package ArrayList;
public class MyArrayList {
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
		// TODO Auto-generated method stub
		MyArrayList list=new MyArrayList();
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(44);
		list.add(15);
		list.add(76);
		list.print();
	}
	
}