package Sept8LinkedHashMap;
class Node
{                
	int key;
	String value;
	Node hashTableNext;
	Node LinkedListNext;
	public Node(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
}
	public class MylinkedHashMap {
		Node[]a=new Node[4];
		Node linkedlistRoot;
		public void add(int key,String value)
		{
			int index=key%a.length;
			if(a[index]==null)
			{
				a[index]=new Node(key,value);
				addLinkedList(a[index]);
			}
			else
			{
				Node temp=a[index];
				while(true)
				{
					if(temp.key==key)
					{
						temp.value=value;
						break;
					}
					else if(temp.hashTableNext==null)
					{
						temp.hashTableNext=new Node(key,value);
						break;
					}
					temp=temp.hashTableNext;
				}
				addLinkedList(temp.hashTableNext);
			}
		}
		
		private void addLinkedList(Node node)
		{
			// TODO Auto-generated method stub
			if(linkedlistRoot==null)
				linkedlistRoot=node;
			else
			{
				Node temp=linkedlistRoot;
				while(temp.LinkedListNext!=null)
				{
					temp=temp.LinkedListNext;
				}
				temp.LinkedListNext=node;
			}
		}
		public String get(int key)
		{
			Node temp=a[key%a.length];
			while(temp!=null)
			{
				if(temp.key==key)
					return temp.value;
				temp=temp.hashTableNext;
			}
			return "not found";
		}
		public void print()
		{
			Node temp=linkedlistRoot;
			while(temp!=null)
			{
				System.out.println(temp.key+" "+temp.value);
				temp=temp.LinkedListNext;
			}
		}

		
	public static void main(String[] args) {
		MylinkedHashMap hm=new MylinkedHashMap();
		hm.add(9, "kolhapur"); 
		hm.add(10, "sangali");
		hm.add(11, "satara");
		hm.add(50, "karad");
		hm.add(16, "a.nagar");
		hm.add(42, "baramati");
		hm.add(45, "akluj");
		hm.add(13, "solapur");
		hm.print();
		
		//System.out.println(hm.get(13));
		System.out.println("\n"+hm.get(13));
	}

}
