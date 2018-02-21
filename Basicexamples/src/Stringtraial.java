
public class Stringtraial {
	public static void main(String args[])
	{
		String str1="abc";
		String str2="abc";
		//System.out.println("str1==str2"+(str1==str2));
		String str3="abcdef";
		String str4=str1+"def";
	//	System.out.println("str3==str4"+(str3==str4));
		String s5=str1.intern();
		String str6="durga";
		String str7=str6.toString();
		System.out.println("str7==str6"+(str6==str7));
		String str8=str6.toLowerCase();
		System.out.println("str8==str7"+(str8==str7));
		String str9=str6.toUpperCase();
		System.out.println("str9==str6"+(str9==str6));
		
		String str10="DURGA";
		System.out.println("str9==str10"+(str9==str10));
		String str11=str9.toUpperCase();
		System.out.println("str9==str11"+(str10==str11));
		System.out.println("intern===="+(s5==str1));
		
	}
}
