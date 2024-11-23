package Sept6doublyLinkedList1Remove;

public class MyClass {

	public static void main(String[] args) {
		MyDoublyLinkedList list=new MyDoublyLinkedList();
		list.add(12);
		list.add(13);
		list.add(15);
//		list.add(11);
//		list.add(18);
//		list.add(19);
		System.out.println("after remove");
//		list.insert(0, 33);
//		list.print();
		list.remove(1);
		list.print();
		
		
	}

}
