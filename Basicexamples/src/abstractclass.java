abstract class AA
{
	private String name;
	private int rollno;
	AA(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public String toString()
	{
		return ("In A class"+name+" "+rollno);
	}


}
class BB extends AA
{
	String dept_no;
	private String name;
	private int rollno;
	BB(String name,int rollno,String dept_no)
	{
		super(name,rollno);
		this.dept_no=dept_no;
	}
	public String toString()
	{
		return (super.toString()+" "+dept_no);
	}

}
public class abstractclass {
	public static void main(String args[]){
	BB b=new BB("deeps",32,"d1");
	System.out.println(b.toString());
	AA a=new BB("hj",31,"d2");
	System.out.println(a);
	}

}
