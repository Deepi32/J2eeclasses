
public class Exceptionclass extends RuntimeException
{
	public static void main(String[] args) {
		try
		{
			int i=10/0;
		}
		catch(Exception e)
		{
			e.toString();
		}
		finally
		{
			System.out.println("FINAL Now");
		}
		System.out.println("FINAL Now now");
	//	throw new Exceptionclass();
	//	System.out.println(10/0);
		
	}

}
