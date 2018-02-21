class Node
{
	int data;
	Node left;
	Node right;
	Node()
	{}
	Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
}
public class LeftViewOfBinaryTree {
	static int max_level=0;
	static void leftview(Node tree)
	{
		leftviewutil(tree,1);
	}
	static void leftviewutil(Node tree,int level)
	{
		if(tree==null)
			return;
		
		if(max_level<level)
		{
			System.out.println(tree.data);
			max_level=level;
		}
		leftviewutil(tree.left,level+1);
		leftviewutil(tree.right,level+1);
		
	}
	public static void main(String[] args) 
	{
		Node tree=new Node(12);
		tree.left=new Node(10);
		tree.right=new Node(30);
		tree.right.left=new Node(25);
		tree.right.right=new Node(40);
		leftview(tree);
		
	}

}
