class List
{
	int data;
	List next;
	List(int data)
	{
		this.data=data;
	}
}
class NodeB
{
	int data;
	NodeB left;
	NodeB right;
	NodeB(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}

}
public class LinkedListtoBST {
	static List node;
	static void addnode(int data)
	{
		List currentnode=new List(data);
		currentnode.next=node;
		node=currentnode;
	}
	int countnodes()
	{
		int count=0;
		List currentnode=node;
		while(currentnode!=null)
		{
			currentnode=currentnode.next;
			count++;
		}
		return count;
	}
	void inorder(NodeB root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	void ListtoBST()
	{
		System.out.println("No of nodes"+countnodes());
		NodeB root=LinkedListToBST(countnodes());
		inorder(root);
	}
	NodeB LinkedListToBST(int n)
	{
		if(n<=0)
			return null;
		NodeB left=LinkedListToBST(n/2);
		NodeB root=new NodeB(node.data);
		root.left=left;
		node=node.next;
		root.right=LinkedListToBST(n-n/2-1);
		return root;
		
		
	}
	
	public static void main(String[] args) {
		addnode(7);
		addnode(6);
		addnode(5);
		addnode(4);
		addnode(3);
		addnode(2);
		addnode(1);
		LinkedListtoBST ll=new LinkedListtoBST();
		ll.ListtoBST();

	}

}
