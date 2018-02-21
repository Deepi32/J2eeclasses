import java.util.Scanner;


public class primenumber {
	public void isPrime(int n)
	{
		int i,isprime=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				isprime=1;
				break;
			}
		}
		if(isprime==1)
			System.out.println(n+" is not prime");
		else
			System.out.println(n+" is prime");
		
	}
	public static void main(String args[])
	{
		primenumber p=new primenumber();
		Scanner sc=new Scanner(System.in);
		p.isPrime(sc.nextInt());
		
	}
}
