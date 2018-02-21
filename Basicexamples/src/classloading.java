class AC
{
	public void Hello()
	{
		System.out.println("Hello i m A");
	}

}


public class classloading {
	public static void main(String args[])
	{
		AC ac=new AC();
		Class c=ac.getClass();
		Class c1=ac.getClass();
		System.out.println(c.getName());
		System.out.println(c.getClassLoader());
		System.out.println(String.class.getClassLoader());
		System.out.println(classloading.class.getClassLoader());
		System.out.println(Object.class.getClassLoader());
		
	}
}
