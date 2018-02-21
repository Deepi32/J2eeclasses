import java.util.Scanner;


public class MaximumDifference {
	public int maxdif(int n,int a[])
	{
		int min[]=new int[n];
		int max[]=new int[n];
		min[0]=a[0];
		for(int i=1;i<n;i++)
		{
			if(min[i-1]>a[i])
				min[i]=a[i];
			else
				min[i]=min[i-1];
		}
		max[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(max[i+1]<a[i])
				max[i]=a[i];
			else
				max[i]=max[i+1];
		}
		int i=0;
		int j=0;
		int maxdif=-1;
		if(a.length==0)
		while(i<n && j<n)
		{
			if(min[i]<max[j])
			{
				if(maxdif<(j-i))
					maxdif=j-i;
				j++;
			}
			else
				i++;
		}
		
		return maxdif;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++){
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		MaximumDifference md=new MaximumDifference();
		System.out.println(md.maxdif(n,a));
		}
		
	}

}
