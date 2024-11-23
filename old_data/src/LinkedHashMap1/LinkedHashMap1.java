package LinkedHashMap1;

public class LinkedHashMap1 {
	
	Node1[] ra=new Node1[4];
	Node1 linkedlist;
	void put(int num,String value1)
	{
		Node1 newobj=new Node1(num,value1);
		int index=num%ra.length;
		if(ra[index]==null)
			ra[index]=newobj;
		else 
		{
			Node1 temp=ra[index];
			while(temp.next1!=null)
				temp=temp.next1;
			temp.next1=newobj;
		}
		//logic for next2
		if(linkedlist==null)
			linkedlist=newobj;
		else
		{
			Node1 temp=linkedlist;
			while(temp.next2!=null)
				temp=temp.next2;
			temp.next2=newobj;
		}
	}
		String get (int num)
		{
		int index=num%ra.length;
		if(ra[index]==null)
		return "not found";
		else 
		{
			Node1 temp=ra[index];
			while(true)
			{
				if(temp.num==num)
					return temp.value1;
				else if(temp.next1!=null)
					temp=temp.next1;
				else 
					return "not found";
			}
			}
		}
	void print()
	{
		if(linkedlist==null)
			System.out.println("empty");
		else
		{
			Node1 temp=linkedlist;
			while(temp!=null)
			{
				System.out.println(temp.num+" "+temp.value1);
				temp=temp.next2;
			}
		}
	}
}
