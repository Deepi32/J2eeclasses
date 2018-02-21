class A
{
int a;
A()
{
	System.out.println("IN A");
}
A(int a)
{
	
this.a=a;

}
void display()
{
	System.out.println("Value of a=="+a);
}
}
public class thisclass {
	public static void main(String args[])
	{
		A a=new A(10);
		a.display();
		
	}
}
