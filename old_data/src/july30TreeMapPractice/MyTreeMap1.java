package july30TreeMapPractice;

import july30TreeMap.Node;

public class MyTreeMap1 {
	Node1 root1;
	String get(int key) //step second
	{
		if(root1==null)
			return "Map is empty";
		else
		{
			Node1 temp=root1;
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
		if(root1==null)
		{
			root1=new Node1(key,value);
		}
		else
		{
			Node1 temp=root1;
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
					temp.left=new Node1(key,value);
					break;
				}
				else if(key>temp.key && temp.right!=null)
					temp=temp.right;
				else
				{
					temp.right=new Node1(key,value);
					break;
				}

			}
		}
	}
	void print()//step third
	{
		if(root1!=null)
			printMyNode(root1);
	}
	private void printMyNode(Node1 abcd) 
	{
		if(abcd.left!=null)
			printMyNode(abcd.left);
		System.out.println(abcd.key+" "+abcd.value);
		if(abcd.right!=null)
			printMyNode(abcd.right);



	}
	
	
}
