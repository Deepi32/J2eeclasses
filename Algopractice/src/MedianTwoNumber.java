
public class MedianTwoNumber {
	public static int findmedian(int ar1[],int ar2[],int st,int end,int st1,int end1)
	{
		int n=end-st+1;
		System.out.println("every"+st+"  "+end+"  "+st1+" "+end1);
		int n1=end1-st1+1;
		if(n!=n1)
			return -1;
		if(n==0)
			return 0;
		if(n==1)
			return (ar1[st]+ar2[st])/2;
		if(n==2){
			System.out.println("inside two"+st+"  "+end+"  "+st1+" "+end1);
			return(Math.max(ar1[st], ar2[st1])+Math.min(ar1[st+1], ar2[st1+1]))/2;}
		int m1=getmedian(ar1,st,end);
		int m2=getmedian(ar2,st1,end1);
		if(m1==m2)
			return m1;
		if(m1<m2)
		{
			System.out.println("m1=="+m1+"m2="+m2);
			if(n%2!=0)
				return findmedian(ar1,ar2,st+n/2,end,st1,st1+n/2);
			else
				return findmedian(ar1,ar2,st+n/2-1,end,st1,st1+n/2);
		}
		else
		{
			if(n%2!=0)
				return findmedian(ar1,ar2,st,st+n/2,st1+n/2,end1);
			else
				return findmedian(ar1,ar2,st,st+n/2,st1+n/2-1,end1);
			
		}
	}
	static int getmedian(int ar1[],int st,int n)
	{
		int n1=(n-st+1)/2;
		if(n1!=0)
			return ar1[n1/2+st];
		else
			return (ar1[n1+st-1]+ar1[n1+st])/2;
	}
	public static void main(String args[])
	{
		 int ar1[] = {1, 2, 3, 6};
		    int ar2[] = {4, 6, 8, 10};
		if(ar1.length!=ar2.length)
			System.out.println("length not same");
		else
			System.out.println( "ANS==="+findmedian(ar1,ar2,0,ar1.length-1,0,ar1.length-1));
			
	}
}
