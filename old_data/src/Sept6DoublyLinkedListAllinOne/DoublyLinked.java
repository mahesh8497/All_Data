package Sept6DoublyLinkedListAllinOne;
public class DoublyLinked {
	Node head ;
	Node tail;
	void add(int num)
	{
		if(head==null)
		{
			head=new Node(num);
			tail=head;
		}
		else
		{
			Node newObj=new Node(num);
			newObj.prev=tail;
			tail.next=newObj;
			tail=newObj;
		}
	}
	void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.num);
			temp=temp.next;
		}
	}
	void remove(int index)
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
				if(count==index && temp.next==null)
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
				if(temp.next==null)
					break;
				temp=temp.next;
				count++;
			}
		}
	}
	void insert(int index,int num)
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
			boolean needAdd=true;
			while(count<index)
			{
				if(temp.next!=null)
				{
					temp=temp.next;
				}
				else
				{
					needAdd=false;
					add(num);
					break;
				}
				count++;
				
			}
			if(needAdd==true)
			{
				Node newObj=new Node(num);
				newObj.prev=temp.prev;
				newObj.next=temp;
				newObj.prev.next=newObj;
				temp.prev=newObj;
			}
		}
	} 
	public static void main(String[] args) {
		DoublyLinked list=new DoublyLinked();
		list.add(12);
		list.add(32);
		list.add(43);
		list.remove(1);
		list.print();
		
	}
}
