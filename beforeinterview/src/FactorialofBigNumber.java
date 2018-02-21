import java.math.BigInteger;
import java.util.Scanner;


public class FactorialofBigNumber {
	public static void findfactorial(int n){
		BigInteger inc=new BigInteger("1");
		BigInteger fact=new BigInteger("1");
	    for(int c=1;c<=n;c++)
	    {
	    	fact=fact.multiply(inc);
	    	inc=inc.add(BigInteger.ONE);
	    }
	    System.out.println("Factorial===="+fact);
	}
	public static void main(String args[])
	{
		int n;
		Scanner input=new Scanner(System.in);
		findfactorial(input.nextInt());
		
		
	}
}
