
public class StringBufferClass {
	
	public static void m1(Long i)
	{
		System.out.println("Widening");
	}
	public static void m1(Integer i)
	{
		System.out.println("Autoboxing");
	}
	public static void m1(int... i)
	{
		System.out.println("var args");
	}
	
	
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("hj");
		Integer i=1000;
		Integer j=1000;
		System.out.println(i==j
				);
		//sb.append(12);
		System.out.println(sb.insert(2,"jkl"));
		int i1=10;
		m1(i1);
	}
}
