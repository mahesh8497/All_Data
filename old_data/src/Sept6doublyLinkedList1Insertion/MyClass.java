package Sept6doublyLinkedList1Insertion;

public class MyClass {

	public static void main(String[] args) {
		MyDoublyLinkedList list=new MyDoublyLinkedList();
		list.add(12);
		list.add(13);
		list.add(15);
		list.add(11);
		list.add(18);
		list.add(19);
		System.out.println("after Insert");
		list.insert(0, 33);
		list.print();
		
		
	}

}
