package Sept6doublyLinkedList1Insertion;

public class MyDoublyLinkedList {
	Node head;
	Node tail;
	public void insert(int index,int num)
	{
		if(index==0)
		{
			Node newObj=new Node(num);
			newObj.next=head;
			head.prev=newObj;
			head=newObj;
		}
		else
		{
			int count=0;
			Node temp=head;
			boolean needToAdd=true;
			while(count<=index-1)
			{
			if(temp.next!=null)	
			{
				temp=temp.next;
			}
			else
			{
				needToAdd=false;
				add(num);
				break;
			}
			count++;
			}
			if(needToAdd==true)
			{
				Node newObj=new Node(num);
				newObj.prev=temp.prev;
				newObj.next=temp;
				newObj.prev.next=newObj;
				temp.prev=newObj;
				
			}
		}
	}
	public void add(int num)
	{
		if(head==null)
		{
			head=new Node(num);
			tail=head;
		}
		else
		{// we create one new object
			Node newObj=new Node(num);
			newObj.prev=tail;
			tail.next=newObj;
			tail=newObj;
		}
	}
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.num);
			temp=temp.next;
		}
	}
	public void printRev()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.num);
			temp=temp.prev;
		}
	}
	
}
