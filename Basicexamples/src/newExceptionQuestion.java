class A11
{
	void Hello() throws Exception
	{
	System.out.println("in arithmetic");
	int a[]=new int[4];
	a[5]=90;
	}

}
class B12 extends A11
{
	void Hello()
	{
	System.out.println("in arithmetic with B");
	
	}
}
public class newExceptionQuestion {
	public static void main(String args[]) throws Exception{
	A11 b=new A11();
	b.Hello();
	}

}
