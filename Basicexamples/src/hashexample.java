import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Employee
{
	int rnol;
	String name;
	Employee(int rnom,String name)
	{
		this.rnol=rnom;
		this.name=name;
	}
	public void getValue()
	{
		System.out.println(rnol+" "+name);
	}
	public int hashCode()
	{
		System.out.println("i m hashcode");
		return 100;
	}
	public boolean equals(Object o1)
	{
		System.out.println("i m equal");
		return false;
	}
}
public class hashexample {
	
	public static void main(String args[])
	{
		Employee e1=new Employee(9,"A");
		Employee e2=new Employee(2,"B");
		Employee e3=new Employee(4,"B");
		HashMap<Employee,Integer> hm=new HashMap<Employee,Integer>();
		hm.put(e1,10);
		hm.put(e2, 8);
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			Employee e11=(Employee) m1.getKey();
			e11.getValue();
			//System.out.println(m1.getValue());
		}
	//	Employee e22=new Employee(2,"B");
		//System.out.println(e2.equals(e2));
		System.out.println("output is "+hm.get(e2));
		
	}
}
