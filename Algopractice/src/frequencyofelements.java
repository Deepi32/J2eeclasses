import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class frequencyofelements {
	public static void findfrequency(int a[],LinkedHashMap lm)
	{
		int st=0;
		int end=a.length-1;
		findbinarysearch(a,st,end,lm);
	}
	public static void findbinarysearch(int a[],int st,int end,LinkedHashMap lm)
	{
		if(a[st]==a[end]){
			if(lm.containsKey(a[st]))
			{
				lm.put(a[st],lm.get(a[st]+(end-st+1)));
			}
			else
				lm.put(a[st],end-st+1);
		}
		else
		{
			int mid=(st+end)/2;
			findbinarysearch(a,st,mid,lm);
			findbinarysearch(a,mid+1,end,lm);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		LinkedHashMap lm=new LinkedHashMap();
		findfrequency(a,lm);
		Set set=(Set) lm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Entry en=(Entry) itr.next();
			System.out.println(en.getKey()+" "+en.getValue());
			
		}
		
	}

}
