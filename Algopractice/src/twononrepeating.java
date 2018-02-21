
public class twononrepeating {
	static void findrepeat(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
			temp^=a[i];
		int getfirstright=temp & ~(temp-1);
		System.out.println(getfirstright+" "+temp);
		int first=0,second=0;
		for(int i=0;i<a.length;i++)
		{
			if((getfirstright & a[i])==0)
				first^=a[i];
			else
				second^=a[i];
				
		}
		System.out.println("First=="+first+"second=="+second);
	}
	public static void main(String args[])
	{
		int arr[] = {2, 3, 7, 9, 11, 2, 3, 11};
		findrepeat(arr);
	}
}
