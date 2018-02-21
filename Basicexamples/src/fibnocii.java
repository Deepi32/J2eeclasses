import java.util.Scanner;


public class fibnocii {
	public static void fib(int n)
	{
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		fib(sc.nextInt());
		
		
		
	}
}
