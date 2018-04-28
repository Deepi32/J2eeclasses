interface A90
{
	void a();
	void b();
	void c();
	

}
abstract class B90 implements A90
{
	public void c()
	{
		System.out.println("i am c");
	}
	
}
class M90 extends B90
{
	public void a()
	{
		System.out.println("i am a");
	}
	public void b()
	{
		System.out.println("i am b");
	}
	


}
public class interfaceabstract {
	public static void main(String[] args) {

		A90 a1=new M90();
		a1.a();
		a1.b();
		a1.c();

	}

}
