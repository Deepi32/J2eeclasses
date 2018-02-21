class AB
{
	 void Hello()
	{
		System.out.println("Hello i m AB");
	}

}
class B extends AB
{
	 void Hello()
	{
		System.out.println("Hello i m B");
	}

}

public class RuntimePolymorphism {
	public static void main(String args[])
	{
		B b=new B();
		b.Hello();
	}

}
