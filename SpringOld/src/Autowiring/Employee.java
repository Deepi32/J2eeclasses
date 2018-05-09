package Autowiring;

public class Employee {
	Address address1;
	String eid;
	public Employee(Address address,String eid)
	{
		this.address1=address;
		this.eid=eid;
	}
	public void setAddress(Address address) {
		this.address1 = address;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public void show()
	{
		System.out.println("Address is ::"+address1.area+"street no"+address1.streetno+"eid is ::"+eid);
	}

}
