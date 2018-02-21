import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;
class MyComparison implements Comparator
{

	//String str;
	public int compare(Object obj1,Object obj2) {
		String str1=obj1.toString();
		String str2=obj2.toString();
		if(str1.compareTo(str2)>0)
			return -1;
		if(str1.compareTo(str2)<0)
			return 1;
		return 0;
	}
	}

public class SetInterface {
	public static void main(String args[])
	{
		HashSet hs=new HashSet();
		hs.add("a");
		hs.add("a");
		hs.add(1);
		hs.add(null);
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("a");
		lhs.add("a");
		lhs.add(1);
		lhs.add(null);
		Iterator it= lhs.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		SortedSet st=new TreeSet( new MyComparison());
		st.add(new StringBuffer("z"));
		st.add(new StringBuffer("c"));
		st.add(new StringBuffer("d"));
		st.add(new StringBuffer("f"));
		st.add(new StringBuffer("g"));
		st.add(new StringBuffer("h"));
		st.add(new StringBuffer("i"));
		st.add(new StringBuffer("1"));
		st.add("bb");
		//st.add(null);
		Iterator it1= st.iterator();
		System.out.println();
		while(it1.hasNext())
		{
			System.out.print(it1.next()+" ");
		}
		System.out.println(st.tailSet("d"));
		System.out.println(st.subSet("h","d"));
	}
}
