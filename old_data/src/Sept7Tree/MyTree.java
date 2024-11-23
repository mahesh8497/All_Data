//package Sept7Tree;
//
//public class MyTree {
//	
//	Node root;
//	public void add(int num)
//	{
//		if(root==null)
//			root=new Node(num);
//		else
//		{
//			Node temp=root;
//			while(true)
//			{
//				if(temp.num==num)
//					break;
//				if(num<temp.num && temp.left==null)
//				{
//					temp.left=new Node(num);
//					break;
//				}
//				else if(num<temp.num && temp.left!=null)
//				{
//					temp=temp.left;
//				}
//				else if(num>temp.num && temp.right==null)
//				{
//					temp.right=new Node(num);
//					break;
//				}
//				else if(num>temp.num && temp.right!=null)
//				{
//					temp=temp.right;
//				}
//			}
//		}
//	}
//	void print()
//	{
//		printMyNode(root);
//	}
//	 void printMyNode(Node node)
//	 {
//		 if(node.left!=null)
//	
//			 printMyNode(node.left);
//			 System.out.println(node.num);
//		
//		 if(node.right!=null)
//		
//			 printMyNode(node.right);
//	
//		// TODO Auto-generated method stub
//		
//	}
//
//	
//	 public static void main(String[] args) {
//		MyTree a=new MyTree();
//		a.add(12);
//		a.add(3);
//		a.add(5);
//		a.add(11);
//		a.add(4);
//		a.print();
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
