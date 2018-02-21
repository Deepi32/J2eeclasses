import java.util.Scanner;


public class Reversewors {
	public void reversewords(String str1)
	{
		System.out.println(str1);
			String words[]=str1.split(" ");
			System.out.println(words.length);
			str1="";
			for(int i=words.length-1;i>=0;i--)
			{
				//String temp=words[i];
				if(i==0)
					str1+=words[i];
				else
				str1+=words[i]+" ";
				//System.out.println(reverse(words[i].toCharArray()));
			}
			System.out.println(str1);
		
	}
	public String reverse(char ar[])
	{
		int st=0,end=ar.length-1;
		char temp;
	//	char ar[]=str.toCharArray();
		while(st<end)
		{
		//	System.out.println(st+":"+end);
			temp=ar[st];
			ar[st++]=ar[end];
			ar[end--]=temp;
			
		}
		System.out.println(ar);
		
		return ar.toString();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1=new String("i love india now");
		Reversewors rv=new Reversewors();
		rv.reversewords(str1);
	}
}
