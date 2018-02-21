import java.lang.reflect.Method;

class Student
{
	String name;
	int rollno;
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		
	}
	public int hashCode()
	{
		return 100;
	}
	public String toString()
	{
		return name+" "+hashCode();
	}
/*	public boolean equals(Object obj)
	{
		try{
		Student s=(Student)obj;
		String str=s.name;
		int rollno=s.rollno;
		if(str.equals(this.name)&& rollno==this.rollno)
			return true;
		else
			return false;
		}
		catch(ClassCastException e){
			return false;
		}
		catch(NullPointerException e)
		{
			return false;
		}
	}  */
}
public class Objectclass {
	
	public static void main(String args[])
	{
		Student s1=new Student("durga",101);
		Student s2=new Student("durga",101);
		Student s3=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(null));
		System.out.println(s1.equals("Durga"));
		Object o=new String("ABC");
		Class c=o.getClass();
		System.out.println("fully qualified name of string is=="+c.getName());
		Method[] m=c.getDeclaredMethods();
		for(Method m1:m)
		{
	//		System.out.println(m1.getName());
		}
	}
}
