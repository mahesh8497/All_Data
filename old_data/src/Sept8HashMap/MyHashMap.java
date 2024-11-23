package Sept8HashMap;

 class Node {
	int key;
	String value;
	Node next;
	public Node(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
}
public  class MyHashMap {
	Node[]a=new Node[5];
	public void add(int key,String value)
	{
		int index=key%a.length;
		if(a[index]==null)
		{
			a[index]=new Node(key,value);
		}
		else
		{
			Node temp=a[index];
			while(true)
			{
				if(temp.key==key)// when key is same 
				{
					temp.value=value;//update the value
					break;
				}
				else if(temp.next==null)//when next element is null
				{
					temp.next=new Node(key,value);//create new Node and break
							break;
				}
				temp=temp.next;//store the next value in temp
			}
			
		}
	}
	
	public String get(int key)
	{
		Node temp=a[key%a.length];
		while(temp!=null)
		{
			if(temp.key==key)
				return temp.value;
			temp=temp.next;
		}
		return "not found";
	}
	public void print()
	{
		for (int i = 0; i < a.length; i++)
		{
		Node temp=a[i];
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			temp=temp.next;
		}
		}
	}

	public static void main(String[] args) {
		MyHashMap hm=new MyHashMap();
		hm.add(9, "kolhapur");
		hm.add(10, "sangali");
		hm.add(11, "satara");
		hm.add(50, "karad");
		hm.add(16, "a.nagar");
		hm.add(42, "baramati");
		hm.add(45, "akluj");
		hm.add(13, "solapur");
		hm.print();
		System.out.println(hm.get(50));
		

	}
}
