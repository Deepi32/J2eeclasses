class AB11111
{
	protected void msg()
	{
		System.out.println("i m in A");
	}

}
public class accessspecifier extends AB11111 {
	protected void msg()
	{
		System.out.println("i m in Accessspecifier");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB11111 a=new accessspecifier();
		a.msg();
	}

}
