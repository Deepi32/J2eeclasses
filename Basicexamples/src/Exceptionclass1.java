
public class Exceptionclass1 {
	public static void main(String[] args)throws Exception {
		doStuff();
	}
	public static void doStuff() throws Exception{
		doMoreStuff();
	}
	public static void doMoreStuff() throws Exception
	{
		Thread.sleep(1000);
	}

}
