package LinkedLIst;

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
		list.add(12);
		list.add(8);
		list.add(8);
		list.add(9);
		list.add(5);
		list.add(6);
		list.add(4);
		list.add(1);
		list.add(2);
		list.print();
	}

}
