import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class mycomparator implements Comparator
{
	Character c;
	Integer freq;
	mycomparator(){}
	mycomparator(char c,int freq)
	{
		this.c=c;
		this.freq=freq;
	}
	public int compare(Object i1,Object i2)
	{
		mycomparator c1=(mycomparator)i1;
		mycomparator c2=(mycomparator)i2;
		Integer freq1=c1.freq;
		Integer freq2=c2.freq;
		int f=freq2.compareTo(freq1);
		if(f==0)
			f=c1.c.compareTo(c2.c);
		return f;
		
	}
}
public class RearrangedCharacters {
	static String findcharacters(String str)
	{
		char ar[]=str.toCharArray();
		int freq[]=new int[26];
		Arrays.fill(freq,0);
		for(int i=0;i<ar.length;i++)
			freq[ar[i]-97]++;
		PriorityQueue<mycomparator> pr=new PriorityQueue<mycomparator>(new mycomparator());
		for(int i=0;i<26;i++)
		{
			if(freq[i]!=0)
			{
				mycomparator m=new mycomparator((char)(97+i),freq[i]);
				pr.add(m);
			}
		}
		System.out.println(pr);
		String str1="";
		while(!pr.isEmpty())
		{
			mycomparator second=null;
			mycomparator first=pr.poll();
			str1+=first.c;
			first.freq--;
			if(!pr.isEmpty()){
			second=pr.poll();
			str1+=second.c;
			second.freq--;
			if(second.freq!=0)
				pr.add(second);
			}
			if(first.freq!=0)
				pr.add(first);
			if(first.freq>0 && second==null)
				return null;
			
		}
		return str1;
	}
	public static void main(String args[])
	{
		String str="aaabcccccc";
		System.out.println(findcharacters(str));
	}

}
