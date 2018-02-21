import java.util.Scanner;


public class Subarraywithgivensum {
	public void indexsum(int n,int sum,int a[])
	{
		int start_index=0;
		int end_index=0;
		if(a.length==1)
		{	
			if(a[start_index]==sum)
				System.out.println("matching index is"+start_index);
			else
				System.out.println("-1");
				return;
				
		}
		int arraysum=a[start_index];
		while(end_index<n)
		{
			if(arraysum==sum)
			{
				System.out.println(++start_index+" "+ ++end_index);
				return;
			}
			if(arraysum<sum)
			{	
				end_index++;
				arraysum+=a[end_index];
				
			
			}
			else{
				arraysum-=a[start_index];
				start_index++;
			}
		}
		System.out.println("-1");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++){
		int n=sc.nextInt();
		int sum=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Subarraywithgivensum sb=new Subarraywithgivensum();
		sb.indexsum(n,sum,a);
		}
	}

}
