
public class tryctach {
	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=10/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array out of bound");
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception");
			
		}
		catch(Exception e)
		{
			System.out.println("any error");
			System.exit(0);
		}
		finally
		{
			System.out.println("final prob");
		}
	}

}
