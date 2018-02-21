import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Exceptiontrywithresources  {
	static int gottacatch()
	{
		try
		{
			System.out.println(10/0);
			return 1;
		}
		catch(Exception e)
		{
			System.exit(0);
			return 2;
		}
		finally
		{
			return 3;
		}
	}
	public static void main(String[] args) {
		List l=new ArrayList();
		Exceptiontrywithresources ex=new Exceptiontrywithresources();
		Exceptiontrywithresources ex1=new Exceptiontrywithresources();
		l.add(ex);
		l.add(ex1);
		System.out.println("i m ");
			System.out.println("i m final"+gottacatch());
		
		
	}

}
