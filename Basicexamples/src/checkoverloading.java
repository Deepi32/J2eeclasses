import java.util.Scanner;

 class ch{
	 
	int ar[]=new int[8];
	static int k=0;
	public  void print(Object ob)
	{
		System.out.print(ob);
	}
	public void print(int i)
	{
		ar[k++]=i;
	}
	public void printall()
	{
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}
}
public class checkoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch c=new ch();
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		c.print(sc.next());
	}
	c.printall();
	}

}
