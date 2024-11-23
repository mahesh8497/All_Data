package july30TreeMapPractice;

public class MyTreeMap3 {
	//create put method
	Node3 root3;
	void put(int key,String value)
	{
		if(root3==null)
		{
			root3=new Node3(key,value);
		}
		else
		{
			Node3 temp=root3;
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
					temp.left=new Node3(key,value);
					break;
				}
				else if(key>temp.key && temp.right!=null)
					temp=temp.right;
				else
				{
					temp.right=new Node3(key,value);
					break;
				}

			}
		}
	
	}
	String get(int key) //step second
	{
		if(root3==null)
			return "Map is empty";
		else
		{
			Node3 temp=root3;
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
	void print ()
	{
		if(root3!=null)
			printNode(root3);
	}
	private void printNode(Node3 sham) 
	{
		if(sham.left!=null)
			printNode(sham.left);
		System.out.println(sham.key+" "+sham.value);
		if(sham.right!=null)
			printNode(sham.right);
			
			
	}


}
