package Sept6doublyLinkedListReverse1;

public class MyDoublyLinkedList {
	Node head;
	Node tail;
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
			tail=newObj;
		}
	}
//	public void print()
//	{
//		Node temp=head;
//		while(temp!=null)
//		{
//			System.out.println(temp.num);
//			temp=temp.next;
//		}
//	}
	public void printRev()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.num);
			temp=temp.prev;
		}
	}
	public static void main(String[] args) {
		MyDoublyLinkedList list=new MyDoublyLinkedList();
		list.add(12);
		list.add(13);
		list.add(15);
		list.add(11);
		list.add(18);
		list.add(19);
		list.printRev();
	//	list.print();
}
}
