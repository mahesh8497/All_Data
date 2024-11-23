package Sept6LinkedList1;

public class MyLinkedList {
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
	
	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(32);
		list.add(55);
		list.add(123);
		
		list.print();
	}
}
