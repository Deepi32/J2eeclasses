import java.util.Scanner;


public class SearchInSortedRotatedArray {
	public static int findloc(int st,int end,int ar[],int el)
	{
		if(st>end)
			return -1;
		int mid=(st+end)/2;
		if(ar[mid]==el)
			return mid;
		if(ar[st]<=ar[mid])
		{
			if(el>=ar[st]&&el<=ar[mid])
				return findloc(st,mid-1,ar,el);
			return findloc(mid+1,end,ar,el);
		}
		if((el>=ar[mid])&&(el<=ar[end]))
			return findloc(mid+1,end,ar,el);
		return findloc(st,mid-1,ar,el);
		
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		int el=sc.nextInt();
		System.out.println(findloc(0,n-1,ar,el));

	}

}
