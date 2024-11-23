package Sept6LinkedListAllinOne2;

public class MyDoublyLinkedList {
	Node head;
	Node tail;
	public void remove(int index)
	{
		if(index==0 && head==tail)
		{
			head=null;
			tail=null;
		}
		else if(index==0)
		{
			head=head.next;
			head.prev=null;
			
		}
		else
		{
			int count=0;
			Node temp=head;
			while(true)
			{
				if(temp.next==null )
				{
					tail=tail.prev;
					tail.next=null;
					break;
				}
				else if(count==index)
				{
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
					break;
				}
				temp=temp.next;
				count++;
			}
		}
	}
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
