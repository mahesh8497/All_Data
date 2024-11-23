package LinkedHashMap3;


public class LinkeHashMap3 {
	Node3[] ra=new Node3[4];
	Node3 linkedlist;
	
	void put(int key,String value)
	{
		Node3 newobj=new Node3(key,value);
		//code for first line
		int index=key%ra.length;
		if(ra[index]==null)
			ra[index]=newobj;
		else
		{
			Node3 temp=ra[index];
			while(temp.nextBlue!=null)
				temp=temp.nextBlue;
			temp.nextBlue=newobj;
		}
		if(linkedlist==null)
			linkedlist=newobj;
		else 
		{
			Node3 temp=linkedlist;
			while(temp.nextred!=null)
				temp=temp.nextred;
			temp.nextred=newobj;
		}
	}
String get(int key)
{
	int index=key%ra.length;
	if(ra[index]==null)
	return "not found";
	else
	{
		Node3 temp=ra[index];
		while(true)
		{
			if(temp.key==key)
				return temp.value;
			else if(temp.nextBlue!=null)
				temp=temp.nextBlue;
			else
				return "not found";
		}
	}
}
void print ()
{
	if(linkedlist==null)
		System.out.println("empty");
	else
	{
		Node3 temp=linkedlist;
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			temp=temp.nextred;
		}
	}
}
}
