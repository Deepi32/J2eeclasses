import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;


public class ListInterface {
	public static void main(String args[])
	{
		LinkedList ar=new LinkedList();//heterogenous elements
		ar.add(1);
		ar.add("z");
		ar.add("n");
		ar.add("v");
		ar.add("a");
		
		ar.add(null);
		ar.add("a");
		//System.out.println(ar.toString());
		Iterator itr=ar.iterator();
		System.out.println(itr.getClass().getName());
		System.out.println();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		//	ar.add("deeps");
		}
		System.out.println("hello list iterator.................");
		ListIterator litr=ar.listIterator();
		while(litr.hasNext())
		{
		//	System.out.print(litr.next()+" "+litr.previousIndex());
			ar.add("deeps");
			System.out.println(litr.next());
			
			
			
		}
		System.out.println("ar list....."+ar);
		
		Vector vc=new Vector();
		vc.addAll(ar);
		Enumeration er=vc.elements();
		System.out.println(er.getClass().getName());
		/*System.out.println("hello    ");
		while(er.hasMoreElements())
		{
			System.out.print(er.nextElement()+" ");
		}*/
		Stack st=new Stack();
		st.push("A");
		st.push(1);
		st.push(null);
		System.out.println(st);
	}
}
