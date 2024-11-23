package ArraysPractice1;

public class cwq9Queue {
	int[]a=new int[3];
	int index=0;
	public void set(int num)
	{
		if(index<a.length)
		{
			a[index]=num;
			index++;
		}
		else
			System.out.println("queue is full");
	}
	public int get()
	{
		if(index>0)
		{
		int temp=a[0];
		for (int i = 0; i <index-1; i++) 
		{
			a[i]=a[i+1];
		}
		index--;
		a[index]=0;
		return temp;
	}
	else
		System.out.println("Queue is empty");
		return 0;

}
	public void print()
	{
		for (int i = 0; i < index; i++) 
		{
		System.out.print(a[i]+" ");	
		}
		System.out.println();
	}
	public static void main(String[] args) {
		cwq9Queue cc=new cwq9Queue();
		cc.set(12);
	}
}


