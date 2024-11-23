package july30TreeMap;

public class MyTreeMap {
	Node root;
	String get(int key) //step second
	{
		if(root==null)
			return "Map is empty";
		else
		{
			Node temp=root;
			while(true)
			{
				if(key==temp.key)
					return temp.value;
				else if(key<temp.key && temp.left!=null)
					temp=temp.left;
				else if(key<temp.key && temp.left==null)
					return "key is not present";
				else if(key>temp.key && temp.right!=null)
					temp=temp.right;
				else if(key>temp.key && temp.right==null)
					return "key is not present";
			}
		}
	}
	void put(int key,String value)//Step first
	{
		if(root==null)
		{
			root=new Node(key,value);
		}
		else
		{
			Node temp=root;
			while(true)
			{
				if(key==temp.key)
				{
					temp.value=value;
					break;
				}
				else if(key<temp.key && temp.left!=null)
					temp=temp.left;
				else if(key<temp.key)
				{
					temp.left=new Node(key,value);
					break;
				}
				else if(key>temp.key && temp.right!=null)
					temp=temp.right;
				else
				{
					temp.right=new Node(key,value);
					break;
				}

			}
		}
	}
	void print()//step third
	{
		if(root!=null)
			printMyNode(root);
	}
	private void printMyNode(Node abcd) {
		if(abcd.left!=null)
			printMyNode(abcd.left);
		System.out.println(abcd.key+" "+abcd.value);
		if(abcd.right!=null)
			printMyNode(abcd.right);
	}
	
}
