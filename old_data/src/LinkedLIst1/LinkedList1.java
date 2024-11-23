package LinkedLIst1;

public class LinkedList1 {
	Node root;
	public void add(int num)
	{
		if(root==null)
		{
			root=new Node(num);
		}
		else
		{
			Node temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(num);
		}
	}
	public void print()
	{
		Node temp=root;
		while(temp!=null)
		{
			System.out.println(temp.num);
			temp=temp.next;
		}
	}
	public static void main(String[] args) 
	{
		LinkedList1 list=new LinkedList1();
		list.add(1);
		list.add(11);
		list.add(12);
		list.add(11);
		list.add(15);
		list.print();
	}
}
