import java.util.Scanner;


public class ElementappearsOnce {
	public void ElementOnce(int n,int a[])
	{
		int x=1,sum,result=0;
		for(int i=0;i<32;i++)
		{
			sum=0;
			x=(1<<i);
			for(int j=0;j<n;j++)
			{
				if((a[j] & x)==0)
					sum++;
			}
			if(sum%3==0)
				result|=x;
			
		}
		System.out.println("result is "+result);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ElementappearsOnce ea=new ElementappearsOnce();
		ea.ElementOnce(n,a);
		
	}

}
