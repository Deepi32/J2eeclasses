import java.util.Scanner;


public class Palindromenumber {
	public void ispalindrome(String str)
	{
		int n=str.length();
		char a[]=str.toCharArray();
		int i=0;
		n--;
		while(i<=n)
		{
			if(a[i]!=a[n])
				break;
			i++;
			n--;
		}
		if(i<n)
			System.out.println("nt palindrome");
		else
			System.out.println("palindroem");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Palindromenumber pn=new Palindromenumber();
		pn.ispalindrome(sc.next());
	}
}
