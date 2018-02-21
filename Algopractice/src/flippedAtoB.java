import java.util.Scanner;


public class flippedAtoB {
	public static int flipped(int a,int b)
	{
		int result=(int)a^b;
		int count=0;
		while(result!=0)
		{
			count+=result&1;
			result>>=1;
		}
		return count;
	}
	public static void main(String[] args) {
		int a,b,result;
		Scanner sc=new Scanner(System.in);
		
		result=flipped(sc.nextInt(),sc.nextInt());
		System.out.println(result);
	}

}
