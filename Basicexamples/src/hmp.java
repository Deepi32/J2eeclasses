import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class hmp {
	public static void main(String[] args) {
		Hashtable hm=new Hashtable();
		hm.put(1, 1);
		Set set= hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			hm.put(3, 2);
			
			System.out.println(itr.next());
			//hm.put(3, null);
			
		}
	}

}
