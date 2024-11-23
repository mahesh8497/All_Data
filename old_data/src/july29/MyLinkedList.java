 package july29;

public class MyLinkedList {
	Node root;
void add(int num)//step first take add method 
{
	if(root==null) 
	{
		root=new Node(num);
	}
	else
	{
		Node temp=root;
		while(temp.nextObj!=null)
		{
			temp=temp.nextObj;
		}
		temp.nextObj=new Node(num);//new create object of node
	}
}
void print()//second stage method
{
	Node temp=root;
	while(temp!=null)
	{
		System.out.println(temp.num);
		temp=temp.nextObj;
	}
}
 
}
