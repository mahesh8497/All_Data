package LinkedHashMap2;

public class LinkeHashMap2 {
	Node2[] ra=new Node2[4];
	Node2 linkedList;

	
	void put(int key1,String value)
	{
		Node2 newobj=new Node2(key1,value);
		int index=key1%ra.length;
		if(ra[index]==null)
			ra[index]=newobj;
		else 
		{
			Node2 temp=ra[index];
			while (temp.nextBlue!=null)
				temp=temp.nextBlue;
			temp.nextBlue=newobj;
		}
		//logic for second line
		if (linkedList==null)
			linkedList=newobj;
		else
		{
			Node2 temp=linkedList;
			while(temp.nextGreen!=null)
		temp=temp.nextGreen;
			temp.nextGreen=newobj;
		}
	}
	String get(int key1)
	{
		int index=key1%ra.length;
		if(ra[index]==null)
			return "Not found";
		else 
		{
			Node2 temp=ra[index];
			while(true)
			{
				if(temp.key1==key1)
					return temp.value;
				else if(temp.nextBlue!=null)
					temp=temp.nextBlue;
				else 
					return "not found";
			}
		}
	}
	void print()
	{
		if(linkedList==null)
		{
			System.out.println("empty");
		}
		else
		{
			Node2 temp=linkedList;
			while(temp!=null)
			{
				System.out.println(temp.key1+" "+temp.value);
				temp=temp.nextGreen;
			}
		}
	}
}
