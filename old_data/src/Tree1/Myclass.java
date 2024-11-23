package Tree1;

public class Myclass {
	
	Node root;
	public void add(int num)
	{
		if(root==null)
		{
			root=new Node(num);
		}
		else
		{
			Node temp=root;
			while(true)
			{
				if(temp.num==num)
					break;
				if(num<temp.num && temp.left==null)
				{
					temp.left=new Node(num);
					break;
				}
				else if(num<temp.num && temp.left!=null)
				{
					temp=temp.left;
				}
				else if(num>temp.num && temp.right==null)
				{
					temp.right=new Node(num);
					break;
				}
				else if(num>temp.num && temp.right!=null)
				{
					temp=temp.left;
				}
					
					
			}
		}
	}
		void print()
		{
			PrintMyNode(root);
		}
		private void PrintMyNode(Node node) 
		{
			if(node.left!=null)
				PrintMyNode(node.left);
			System.out.println(node.num);
			if(node.right!=null)
				PrintMyNode(node.right);
			// TODO Auto-generated method stub
			
		}
		public static void main(String[] args) 
		{
			Myclass a=new Myclass();
			a.add(6);
			a.add(1);
			a.add(4);
			a.add(9);
			a.print();
		}
}
