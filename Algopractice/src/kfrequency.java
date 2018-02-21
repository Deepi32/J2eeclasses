import java.util.Scanner;


public class kfrequency {
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);  
	int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
		String str=s.next();
		char ar[]=str.toCharArray();
		int N[]=new int[26];
		for(int j=0;j<26;j++)
			N[j]=0;
		for(int j=0;j<str.length();j++)
		{
			N[ar[j]-97]++;
		}
		int N1[]=new int[26];
		for(int j=0;j<26;j++)
			N1[j]=-1;
		for(int j=0;j<26;j++){
			if(N1[N[j]]==-1 && N[j]!=0){
				System.out.println(N[j]+"  "+N1[j]);
			N1[N[j]]=j;}
		}
		for(int j=0;j<26;j++)
			System.out.print(" "+N[j]+" ");
		System.out.println();
		for(int j=0;j<26;j++)
			System.out.print(" "+N1[j]+" ");
		
	}
	}

}
