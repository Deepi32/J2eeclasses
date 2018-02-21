import java.util.ArrayList;
import java.util.Iterator;
class A13
{
void Hello(int i) 
{
	System.out.println("A class constructor");

}
void Hello(String i) 
{
	System.out.println("A string class constructor");

}
}
class BA13 extends A13
{
	static  void Hello() 
	{
		System.out.println("B class constructor");

	}
	 void jello()
	{
		System.out.println("B class jello constructor");
		}
	
}

public class concurrentmodifer {
	public static void main (String[] args) throws java.lang.Exception
	{
		A13 a=new A13();
		a.Hello(null);
	
	
	}

}
