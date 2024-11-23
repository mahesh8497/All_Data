package Sept9HashMapGene;

class Node<DT1,DT2>
{
	DT1 key;
	DT2 value;
	Node <DT1,DT2> next;
	public Node(DT1 key, DT2 value) {
		super();
		this.key = key;
		this.value = value;
	}
}

public class classA <DT1,DT2> {
Node<DT1,DT2>[] a=new Node[5];
public void add(DT1 key,DT2 value)
{
	int index=key.hashCode()%a.length;
	if(a[index]==null)
	{
		a[index]=new Node<DT1,DT2>(key,value);
	}
	else
	{
		Node<DT1,DT2> temp=a[index];
		while(true)
		{
			if(temp.key==key)
			{
				temp.value=value;
				break;
			}
			else if(temp.next==null)
			{
				temp.next=new Node<DT1,DT2>(key,value);
				break;
			}
			temp=temp.next;
		}
	}
}
public DT2 get(DT1 key)
{
	Node<DT1,DT2> temp=a[key.hashCode()%a.length];
			while(temp!=null)
			{
				if(temp.key==key)
				{
					return temp.value;
				}
				temp=temp.next;
			}
			return null;//return null bcz we cant send string
}
public void print()
{
	for (int i = 0; i < a.length; i++) 
	{
	Node <DT1,DT2> temp=a[i];
	while(temp!=null)
	{
		System.out.println(temp.key+" "+temp.value);
		temp=temp.next;
	}
	}
}
public static void main(String[] args)
{
	classA <Integer,String>hm=new classA<>();
	hm.add(	12, "pune");
	hm.add(13, "solapur");
	hm.add(11, "satara");
	hm.add(10, "sangali");
	hm.print();
	System.out.println(hm.get(12));
}

}
