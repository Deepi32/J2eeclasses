
public class Stringclass {
	public static void main(String args[])
	{
		String s1=new String("durga");//in heap
		String s2=s1.toString();
		String s3=s2.toLowerCase();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		String s4="hello";
		String s5=s4.toString();
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
	}
}
