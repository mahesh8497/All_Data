package Sept7TreeA;



public class MyTree {
	
	Node root;
	public void add(int num, String value)
	{
		if(root==null)
			root=new Node(num,value);
		else
		{
			Node temp=root;
			while(true)
			{
				if(temp.num==num)
					break;
				if(num<temp.num && temp.left==null)
				{
					temp.left=new Node(num,value);
					break;
				}
				else if(num<temp.num && temp.left!=null)
				{
					temp=temp.left;
				}
				else if(num>temp.num && temp.right==null)
				{
					temp.right=new Node(num,value);
					break;
				}
				else if(num>temp.num && temp.right!=null)
				{
					temp=temp.right;
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
		System.out.println(abcd.num+" "+abcd.value);
		if(abcd.right!=null)
			printMyNode(abcd.right);
	}

	
	 public static void main(String[] args) {
		MyTree a=new MyTree();
		a.add(10,"ten");
		a.add(3,"three");
		a.add(5,"five");
		a.add(11,"eleven");
		a.add(4,"four");
		a.print();
	}
	
	
	
	
	
	
	
	
	
	
	
}
