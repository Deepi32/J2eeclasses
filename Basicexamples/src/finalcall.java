class f1
{
	final int t1;
	final int t2;
	int t4=12;
	{
		t2=11;
	}
	f1()
	{
		t1=12;
	}
	f1(int i)
	{
		//System.out.println("final"+t1);
		t1=13;
		System.out.println("final"+t1);
		
	}
	class A2
	{
		A2(){
		System.out.println("final"+t1);
		System.out.println(t4);
		}
	}

}
public class finalcall {
	public static void main(String args[])
	{
		f1 f=new f1();
		new f1.A2();
	}

}
