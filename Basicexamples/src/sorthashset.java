import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
class Employee11
{
	int e_id;
	int h;
	Employee11(int e_id,int h)
	{
		this.e_id=e_id;
		this.h=h;
	}
	public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + e_id;
       // result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    
	public boolean equals(Object o1)
	{
		Employee11 e1=(Employee11)o1;
		if(this.e_id==e1.e_id && this.h==e1.h)
			return true;
		return  false;
	}

}
public class sorthashset {
	Employee11 e2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h1=new HashSet();
		h1.add("g");
		h1.add("A");
		h1.add("AA");
		h1.add("Ka");
		h1.add("K");
		System.out.println("h1 is"+h1);
		ArrayList ar=new ArrayList(h1);
		Collections.sort(ar);
		System.out.println("h1 is"+ar);
		LinkedHashSet lh=new LinkedHashSet(ar);
		System.out.println("h1 is"+lh);
		//Sort HashMap by keys
		HashMap h11=new HashMap();
		h11.put(1,"A" );
		h11.put(8,"E" );
		h11.put(5,"B" );
		h11.put(3,"N" );
		h11.put(6,"C" );
		h11.put(11,"Z" );
		h11.put(21,"K" );
		h11.put(31,"L" );
		Set s1=h11.entrySet();
		List<Entry<Integer,String>> ar1=new ArrayList(s1);
		Comparator<Entry<Integer,String>> valuecompare=new Comparator<Entry<Integer,String>>(){
			public int compare(Entry<Integer,String> e1,Entry<Integer,String> e2)
			{
				Integer i1=e1.getKey();
				Integer i2=e2.getKey();
				return i1.compareTo(i2);
			}
			
		};
		Comparator<Entry<Integer,String>> valuecompare1=new Comparator<Entry<Integer,String>>(){
			public int compare(Entry<Integer,String> e1,Entry<Integer,String> e2)
			{
				String i1=e1.getValue();
				String i2=e2.getValue();
				return i1.compareTo(i2);
			}
			
		};
		Collections.sort(ar1,valuecompare1);
		
		LinkedHashMap ll2=new LinkedHashMap();
		for(Entry e1:ar1)
			ll2.put(e1.getKey(),e1.getValue());
		
		System.out.println("list is :::::"+ll2);
		Set<Entry<Integer,String>> s3=h11.entrySet();
		for(Entry<Integer,String> e3:s3)
			System.out.println(e3.getKey()+"  "+e3.getValue());
		System.out.println("After sort by key");
		Set<Entry<Integer,String>> s2=ll2.entrySet();
		for(Entry<Integer,String> e2:s2)
			System.out.println(e2.getKey()+"  "+e2.getValue());
		//Sort by value
		Collections.sort(ar1,valuecompare1);
		LinkedHashMap ll3=new LinkedHashMap();
		for(Entry e1:ar1)
			ll3.put(e1.getKey(),e1.getValue());
		System.out.println("After sort by value");
		Set<Entry<Integer,String>> s31=ll3.entrySet();
		for(Entry<Integer,String> e3:s31)
			System.out.println(e3.getKey()+"  "+e3.getValue());
		Employee11 e1=new Employee11(1,2);
		HashMap<Employee11,Integer> h14=new HashMap<Employee11,Integer>();
		h14.put(e1, 1);
		Employee11 e2=new Employee11(2,3);
		
		h14.put(e2,3);
		Employee11 e3=new Employee11(11,21);
		h14.put(e3,30);
		Employee11 e4=new Employee11(11,21);
		System.out.println();
		System.out.println(e4.equals(e3));
		System.out.println(h14.get(e4));
		
		
		
		
		
	}

}
