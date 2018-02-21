import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class map {
	public static void main(String args[])
	{
		IdentityHashMap hm=new IdentityHashMap();
		hm.put(1,"A");
		hm.put(2,"V");
		hm.put(3,"V");
		hm.put(6,"P");
		hm.put(5,"A");
		hm.put(4,"A");
		Set s1=hm.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		LinkedHashMap lhm=new LinkedHashMap(hm);
		Set s2=lhm.keySet();
		System.out.println(s2);
		ConcurrentHashMap ch=new ConcurrentHashMap();
		ch.put(1,"A");
		ch.put(2,"B");
		ch.put(3,"C");
		ch.put(4,"D");
		ch.put(5,"G");
		Iterator ir=ch.keySet().iterator();
		while(ir.hasNext())
		{
			Integer key=(Integer)ir.next();
			System.out.println(key+" : "+ch.get(key));
			ch.put(6,"G");
		}
		Set s3=ch.keySet();
		System.out.println(s3);
		
	}
}
