import java.util.Scanner;


public class RemoveZero {
	public static void removetrailingzero(String str)
	{
		int i=0;
		while(str.charAt(i)=='0')
			i++;
		StringBuffer sb=new StringBuffer(str);
		sb.replace(0,i,"");
		System.out.println(sb);
	}
	public static void main(String args[])
	{
		//StringBuffer sb=new StringBuffer();
		String st;
		Scanner sc=new Scanner(System.in);
		st=sc.next();
		removetrailingzero(st);
		
	}

}
