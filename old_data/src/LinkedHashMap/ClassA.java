//package LinkedHashMap;
//
////	class Node
////	{
////		int key;
////		String value;
////		Node hashTableNext;
////		Node LinkedListNext;
////		public Node(int key, String value) {
////			super();
////			this.key = key;
////			this.value = value;
////		}
////	}
////	
//
//public class ClassA {
//	Node[] a=new Node[5];
//	Node LinkedListRoot;
//	public void add(int key,String value)
//	{
//		int index=key%a.length;
//		if(a[index]==null)
//		{
//			a[index]=new Node( key,value);
//			addLinkeList(a[index]);
//		}
//		else
//		{
//			Node temp=a[index];
//			while(true)
//			{
//				if(temp.key==key)
//				{
//					temp.value=value;
//					break;
//				}
//				else if(temp.hashTableNext==null)
//				{
//					temp.hashTableNext=new Node(key,value);
//							break;
//				}
//				temp=temp.hashTableNext;
//			}
//			addLinkeList(temp.hashTableNext);
//		}
//	}
//	private void addLinkeList(Node node) 
//	{
//		if(LinkedListRoot==null)
//			LinkedListRoot=node;
//		else
//		{
//			Node temp=LinkedListRoot;
//			while(temp.LinkedListNext!=null)
//			{
//				temp=temp.LinkedListNext;
//			}
//			temp.LinkedListNext=node;
//		}
//		// TODO Auto-generated method stub
//		
//	}
//	public String get(int key)
//	{
//		Node temp=a[key%a.length];
//		while(temp!=null)
//		{
//			if(temp.key==key)
//				return temp.value;
//			temp=temp.hashTableNext;
//		}
//		return "Not Found";
//	}
//	public void print()
//	{
//		Node temp=LinkedListRoot;
//		while(temp!=null)
//		{
//			System.out.println(temp.key+" "+temp.value);
//			temp=temp.LinkedListNext;
//		}
//	}
//	public static void main(String[] args) {
//		ClassA lhm=new ClassA();
//		lhm.add(12, "twelve");
//		lhm.add(4, "four");
//		lhm.add(5, "five");
//		lhm.add(2, "two");
//		lhm.add(9, "nine");
//		lhm.print();
//	}
//
//}
