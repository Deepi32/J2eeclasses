class Excption1 extends RuntimeException
{
	Excption1(String s)
	{
		super(s);
	}
}
class Excption2 extends RuntimeException
{
	Excption2(String s)
	{
		super(s);
	}
}
class H
{
	static int i=10/0;
	H()
	{
		System.out.println(i);
	}

}
public class ExceptionCustomized {
	public static void main(String[] args) {
		H h=new H();
		int age=16;
		if(age<18)
			throw new Excption1("too young to handle");
		else
			throw new Excption1("too old to handle");
	}

}
