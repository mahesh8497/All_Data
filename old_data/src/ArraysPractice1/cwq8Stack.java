package ArraysPractice1;

public class cwq8Stack {
	int[] a=new int[3];
	int index=0;
	public int pop()
	{
		if(index>0)
	{
		index--;
		int p=a[index];
		a[index]=0;
		return p;
	}
	return 0;
}
public void push(int num)
{
	if(index<a.length)
	{
		a[index]=num;
		index++;
	}
	else 
	{
		System.out.print("Stack is full");
		System.out.println();
	}
}
public void print()
{
	for (int i = 0; i <index; i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
}
public static void main(String[] args) {
	cwq8Stack m=new cwq8Stack();
	 m.print();
	  m.push(5);
	  m.print();
	  m.push(4);
	  m.print();
	  

	  m.push(3);
	  m.print();

	System.out.println("******************");
	  System.out.print(m.pop());
	  m.print();  
	  System.out.print(m.pop());
	  m.print();  
	  
	  
		}
		

}
