package Sept6LinkedList;

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
	public String toString()
	{
		String s="";
		Node temp=root;
		while(temp!=null)
		{
			s=s+temp.num;
			if(temp.next!=null)
				s=s+", ";
			temp=temp.next;
		}
		s=s+"";
		return s;
	
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

}
