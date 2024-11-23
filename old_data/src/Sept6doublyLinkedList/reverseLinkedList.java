package Sept6doublyLinkedList;
class Node {
	int num;
	Node next;
	Node prev;
	public Node(int num) {
		super();
		this.num = num;
	}
}
public class reverseLinkedList {
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
		{
			Node newObj=new Node(num);
			newObj.prev=tail;
			tail=newObj;
					
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
	public static void main(String[] args) {
		reverseLinkedList list=new reverseLinkedList();
		list.add(1);		
		list.add(1);		
		list.add(13);		
		list.add(2);		
		list.add(4);		
		list.add(21);		
		list.add(121);		
		//list.printRev();	
		list.printRev();
	}

}
