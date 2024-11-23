package HashMap;

	class Node{
		int key;
		String value;
		Node next;
		public Node(int key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
	}

public class classA {
	Node[] a=new Node[5];
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
				if(temp.key==key)
				{
					temp.value=value;
					break;
				}
				else if(temp.next==null)
				{
					temp.next=new Node(key,value);
					break;
				}
				temp=temp.next;
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
	public static void main(String[] args)
	{
		classA hm=new classA();
		hm.add(12, "pune");
		hm.add(13, "pune");
		hm.add(11, "pune");
		hm.add(10, "pune");
		hm.print();
	}

}
