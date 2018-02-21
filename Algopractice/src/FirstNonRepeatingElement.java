import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class FirstNonRepeatingElement {
	static void nonrepeating(char ar[])
	{
		LinkedList<Character> ll=new LinkedList<Character>();
		ll.add(ar[0]);
		System.out.print(ll.getFirst()+" ");
		for(int i=1;i<ar.length;i++)
		{
			Character a='0';
			while(!ll.isEmpty()&&(ar[i]==ll.getLast()))
				a=ll.removeLast();
			if(a=='0')
				ll.addLast(ar[i]);
			if(ll.isEmpty())
				System.out.print("-1 ");
			else
				System.out.print(ll.getFirst()+" ");
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			char ar[]=new char[n];
			String str="";
			for(int j=0;j<n;j++)
				str+=sc.next();
			//System.out.println(str);
			nonrepeating(str.toCharArray());
		}
		
		
		
	}
}
