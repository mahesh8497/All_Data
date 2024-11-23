package LinkedHashMap4;

public class LinkedhashMap {
	Node4[] ra=new Node4[4];
	Node4 linkedlist;
	
	
	void put(int key, String value)
	{
	Node4 newobj=new Node4(key,value);
			int index=key%ra.length;
			if(ra[index]==null)
				ra[index]=newobj;
			else
			{
				Node4 temp=ra[index];
				while(temp.nextblack!=null)
					temp=temp.nextblack;
				temp.nextblack=newobj;
			}
	if(linkedlist==null)
		linkedlist=newobj;
	else 
	{
		Node4 temp=linkedlist;
		while(temp.nextwhite!=null)
			temp=temp.nextwhite;
		temp.nextwhite=newobj;
	}
	}
	String get(int key)
	{
		int index=key%ra.length;
		if(ra[index]==null)
			return "not found";
		else
		{
			Node4 temp=ra[index];
			while(true)
			{
				if(temp.key==key)
					return temp.value;
				else if(temp.nextblack!=null)
					temp=temp.nextblack;
				else
					return "not found";
			}
		}
	}
void print()
{
	if(linkedlist==null)
		System.out.println("Empty");
	else
	{
		Node4 temp=linkedlist;
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			temp=temp.nextwhite;
		}
	}
}
}
