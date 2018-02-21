
public class peakElement {
	public static void findpivot(int ar[])
	{
		int last=ar[0],pivot=-1;
		for(int i=0;i<ar.length-1;i++)
		{
			if((last<=ar[i])&&(ar[i]>=ar[i+1]))
			{	
				pivot=ar[i];
				break;
			}
			last=ar[i];
		}
		if((pivot==-1)&&(last<=ar[ar.length-1]))
			pivot=ar[ar.length-1];
		System.out.println("pivot=="+pivot);
			
	}
	public static void main(String args[])
	{
		int ar[]={5, 10, 20, 15};
		findpivot(ar);
	}
}
