import java.io.IOException;


public class trycatchthrow {
	static void validate(int age) throws IOException
	{
		if(age<18)
			throw new IOException("exception handled");
		else
			System.out.println("no exception");
	}
	public static void main(String[] args) throws IOException {
		validate(17);
	}

}
