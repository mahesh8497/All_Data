package july30TreeMapPractice;

public class MyTreeMap2 {
	//step first to create put method
	//step Second to create get Method
	//Step third to create print method
	Node2 root2;
	void put(int key,String value)
	{
		if(root2==null)
		{
			root2=new Node2(key,value);
		}
		else
		{
			Node2 temp=root2;
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
					temp.left=new Node2(key,value);
					break;
				}
				else if(key>temp.key && temp.right!=null)
					temp=temp.right;
				else
				{
					temp.right=new Node2(key,value);
					break;
				}

			}
		}
	
	}
	String get(int key) //step second
	{
		if(root2==null)
			return "Map is empty";
		else
		{
			Node2 temp=root2;
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
		if(root2!=null)
			printNode(root2);
	}
	private void printNode(Node2 sham) 
	{
		if(sham.left!=null)
			printNode(sham.left);
		System.out.println(sham.key+" "+sham.value);
		if(sham.right!=null)
			printNode(sham.right);
			
			
	}


}
