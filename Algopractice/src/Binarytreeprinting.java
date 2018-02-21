import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
class Link
{
	int data;
	Node1 next;
	Node1 prev;
	Link(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	Link()
	{}
}
class res
{
	static int max_val=Integer.MIN_VALUE;	
}
class Node1
{
	int data;
	Node1 left;
	Node1 right;
	Node1(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
	Node1(){}

}
public class Binarytreeprinting {
	static int max_lca;
	static Node1 head;
	static void binarytoDLL(Node1 tree)
	{
		if(tree==null)
			return;
		binarytoDLL(tree.right);
		tree.right=head;
		if(head!=null)
			head.left=tree;
		head=tree;
		binarytoDLL(tree.left);
		
	}
	static void Display(Node1 tree)
	{
		while(tree!=null)
		{
			System.out.print(tree.data);
			tree=tree.right;
		}
	}
	static void isImage(Node1 root)
	{
		if(root==null)
			return ;
		System.out.println(isImagesub(root.left,root.right));
		
	}
	static boolean isImagesub(Node1 left,Node1 right)
	{
		if(left==null && right==null)
			return true;
		if(left==null || right==null)
			return false;
		return ((left.data==right.data)&&(isImagesub(left.left,right.right))&&(isImagesub(left.right,right.left)));
	}
	static int height(Node1 root)
	{
		if(root==null)
			return 0;
		int lheight=height(root.left)+1;
		int rheight=height(root.right)+1;
		if(lheight>rheight)
			return lheight;
		else
			return rheight;
		
	}
	static void LCA(Node1 tree,int data1,int data2)
	{
		if(tree==null)
			return;
		
		if(tree.data<data1 &&tree.data<data2)
		{
			max_lca=tree.data;
			LCA(tree.right,data1,data2);
		}
		else if(tree.data>data1 &&tree.data>data2)
		{
			max_lca=tree.data;
			LCA(tree.left,data1,data2);
		}	
		else
		{
			max_lca=tree.data;
			return;
		}
	}
	static int Maximum_Path_Sum(Node1 root)
	{
		if(root==null)
			return 0;
		int l=Maximum_Path_Sum(root.left);
		int r=Maximum_Path_Sum(root.right);
		int temp_max=Math.max(Math.max(l,r)+root.data,root.data);
		int final_max=Math.max(temp_max,l+r+root.data);
		res.max_val=Math.max(final_max,res.max_val);
		return final_max;
		
	}
	static int max_value=Integer.MIN_VALUE;
	static int Diameter(Node1 root)
	{
		if(root==null)
			return 0;
		int l=0,r=0;
		if(root.left!=null)
			 l=Diameter(root.left)+1;
		if(root.right!=null)
			r=Diameter(root.right)+1;
		if(max_value<l+r)
			max_value=l+r;
		return Math.max(l, r);
	}
	static void vertical_order(Node1 tree,int level,HashMap<Integer,List> hm)
	{
		if(tree==null)
			return;
		System.out.println("level===="+level);
		if(hm.containsKey(level))
		{
			List l1=(List) hm.get(level);
			l1.add(tree.data);	
			hm.put(level,l1);
		}
		else{
			List l1=new LinkedList();
			l1.add(tree.data);
			
			hm.put(level,l1);
			}
		if(tree.left!=null)
			vertical_order(tree.left,level-1,hm);
		if(tree.right!=null)
			vertical_order(tree.right,level+1,hm);
				
		
	}
	public static void main(String[] args) {
		Node1 tree = new Node1(1);
      //  tree.root = new Node1(1);
        tree.left = new Node1(2);
        tree.right = new Node1(3);
        tree.left.left = new Node1(4);
        tree.left.left.left = new Node1(6);
        tree.left.left.left.right = new Node1(7);
        tree.left.left.left.left = new Node1(6);
        tree.left.right = new Node1(5);
        tree.left.right.right = new Node1(5);
        tree.left.right.right.right = new Node1(5);
        tree.left.right.right.right.left = new Node1(5);
        LCA(tree,3,8);
    //    System.out.println("max_lca===="+max_lca);
        //binarytoDLL(root);
        //Display(head);
        isImage(tree);
        System.out.println("max value==="+max_value);
        System.out.println("sum==="+Maximum_Path_Sum(tree)+" "+res.max_val);
        System.out.println("max diameter==="+Diameter(tree)+" "+max_value);
		/*HashMap<Integer,List> hm=new HashMap<Integer,List>();
		vertical_order(root,0,hm);
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			List l1=(List)m.getValue();
			Iterator it=l1.iterator();
			while(it.hasNext())
				System.out.print(it.next()+" ");
			System.out.println();
			
		}*/
	}

}
