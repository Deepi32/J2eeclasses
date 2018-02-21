final class MyString
{
	String str;
	MyString(String st){
		str=st;}
	public MyString add(String str)
	{
		if(this.str.equals(str))
			return this;
		else
			return (new MyString(str));
	}
	
}
public class MyStringClass {
	
	public static void main(String args[])
	{
		MyString t1=new MyString("HelloWorld");
		MyString t2=t1.add("HelloWorld");
		MyString t3=t1.add("helloWorld");
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		
	}
}
