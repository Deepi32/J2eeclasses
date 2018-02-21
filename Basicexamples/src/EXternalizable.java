import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class EXternalizable implements Externalizable{
	String name;
	int rollno;
	int j;
	EXternalizable()
	{
		System.out.println("IN constructor");
	}
	EXternalizable(String name,int rollno,int j)
	{
		this.name=name;
		this.rollno=rollno;
		this.j=j;
	}
	
	public void readExternal(ObjectInput ois) throws IOException,
	ClassNotFoundException {
		String name=(String) ois.readObject();
		int rollno=(Integer)ois.readInt();

	}
@Override
	public void writeExternal(ObjectOutput oos) throws IOException {
		oos.writeObject(name);
		oos.writeInt(rollno);
	
	}
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		EXternalizable ex=new EXternalizable("durga",12,8);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ex);
		FileInputStream fis=new FileInputStream("abc.ser");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		EXternalizable a2=(EXternalizable)ois.readObject();
		System.out.println(a2.name+" "+a2.rollno+" "+a2.j);

	}

	

}
