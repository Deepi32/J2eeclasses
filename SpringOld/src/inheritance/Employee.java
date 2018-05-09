package inheritance;

public class Employee {
	Address address1;
	String eid;
	String name;
	Employee(){}
	public Employee(Address address,String eid,String name)
	{
		this.address1=address;
		this.eid=eid;
		this.name=name;
	}
	public void show()
	{
		System.out.println("Name is: "+name+"eid is :"+eid);
		System.out.println("Address is :"+address1);
	}

}
