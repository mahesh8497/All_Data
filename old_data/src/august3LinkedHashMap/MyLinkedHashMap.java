package august3LinkedHashMap;

public class MyLinkedHashMap 
{
Node[] rootArray=new Node[4];
Node linkedListroot;
void put(int key,String value)
{
	Node newObj=new Node(key,value);
			//blue line Logic for indexwise
			int index=key%rootArray.length;
	if(rootArray[index]==null)
		rootArray[index]=newObj;
	else
	{
		Node temp=rootArray[index];
		while(temp.nextBlue!=null)
			temp=temp.nextBlue;
		temp.nextBlue=newObj;//create new object for blue line 
	}
	//green line Logic for sequencewise
	if(linkedListroot==null)
		linkedListroot=newObj;
	else
	{
		Node temp=linkedListroot;
		while(temp.nextGreen!=null)
			temp=temp.nextGreen;
		temp.nextGreen=newObj;//create new object for linkedListroot (green line) 
	}
}
String get(int key)
{
	int index=key%rootArray.length;
	if(rootArray[index]==null)
		return "not found";
	else
	{
		Node temp=rootArray[index];
		while(true)
		{
			if(temp.key==key)
				return temp.value;
			else if(temp.nextBlue!=null)
				temp=temp.nextBlue;
			else
				return "notfound";
		}
	}
}
void print()
{
	if(linkedListroot==null)
		System.out.println("empty");
	else
	{
		Node temp=linkedListroot;
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			temp=temp.nextGreen;
		}
	}
}

}
