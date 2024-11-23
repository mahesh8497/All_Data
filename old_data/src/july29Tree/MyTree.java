
package july29Tree;

public class MyTree {
	Node root;
	void print()
	{
		if(root!=null)
			printMyNode(root);
	}
	private void printMyNode(Node node) 
	{
		if(node.left!=null)
			printMyNode(node.left);
		System.out.println(node.num+" ");
		if(node.right!=null)
			printMyNode(node.right);
	}
	void add(int num)
	{
		if(root==null)
		{
			root=new Node (num);
		}
		else
		{
			Node temp=root;
			while(true)
			{
				if(num==temp.num)
				{
					
					break;
				}
				else if(num<temp.num && temp.left!=null)
					temp=temp.left;
				else if(num<temp.num && temp.left==null)
				{
					temp.left=new Node(num);
					break;
				}
				else if(num>temp.num && temp.right!=null)
					temp=temp.right;
				else if(num>temp.num && temp.right==null)
				{
					temp.right=new Node(num);
					break;
				}
			}
		}
	}

}
