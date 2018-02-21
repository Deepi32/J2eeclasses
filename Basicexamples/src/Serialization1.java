import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Accounts implements Serializable
{
	String username="deeps";
	transient String pswd="goyal";
	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		oos.defaultWriteObject();
		String epwd="123"+pswd;
		oos.writeObject(epwd);
	}
	private void readObject(ObjectInputStream ois) throws Exception
	{
		ois.defaultReadObject();
		String epswd=(String)ois.readObject();
		pswd=epswd.substring(3);
	}

}
public class Serialization1 
{
	public static void main(String[] args) throws Exception {
		Accounts ac=new Accounts();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ac);
		FileInputStream fis=new FileInputStream("abc.ser");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		Accounts a2=(Accounts)ois.readObject();
		System.out.println(a2.username+" "+a2.pswd);
		
	}

}
