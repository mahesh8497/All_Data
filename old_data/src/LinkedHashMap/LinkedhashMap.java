package LinkedHashMap;

class Node {
	int key;
	String value;
	Node hashTableNext;
	Node LinkedListNext;
	public Node(int key, String value)
	{
		this.key=key;
		this.value=value;
	}
}
public class LinkedhashMap {
	Node[] ra=new Node[4];
	Node linkedList;
	void put(int key, String value)
	{
		Node newobj=new Node(key,value);
			//blue line Logic//hashtableNext	
		int index=key%ra.length;
		if(ra[index]==null)
			ra[index]=newobj;
		else
		{
			Node temp=ra[index];
			while(temp.hashTableNext!=null)
				temp=temp.hashTableNext;
			temp.hashTableNext=newobj; 
		}
		
		//green line logic//linkedListnext
		if(linkedList==null)
			linkedList=newobj;
		else
		{
			Node temp=linkedList;
			while(temp.LinkedListNext!=null)
				temp=temp.LinkedListNext;
			temp.LinkedListNext=newobj;
		}
	}
	String get(int key)
	{
		int index=key%ra.length;
		if(ra[index]==null)
			return "not found";
		else
		{
			Node temp=ra[index];
			while(true)
			{
				if(temp.key==key)
					return temp.value;
				else if(temp.hashTableNext!=null)
					temp=temp.hashTableNext;
				else
					return "not found";
				}
		}
	}
	void print()
	{
		if(linkedList==null)
			System.out.println("empty");
		else 
		{
			Node temp=linkedList;
			while(temp!=null)
			{
				System.out.println(temp.key+" "+temp.value);
				temp=temp.LinkedListNext;
			}
		}
	}
	public static void main(String[] args) 
	{
		LinkedhashMap map=new LinkedhashMap();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.print();
		System.out.println(map.get(3));
	}

}
