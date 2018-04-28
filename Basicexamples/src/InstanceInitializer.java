class A199
{
	A199()
	{
		System.out.println("Hello World in A");
	}

}
class B199 extends A199
{
B199()
{
	System.out.println("In B class");
}	

{
	System.out.println("Instance initializer");
	
}
static
{
	System.out.println("static instance");
}

}
public class InstanceInitializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B199 b=new B199();
		System.out.println("After second....................................");
		B199 c=new B199();
	}

}
