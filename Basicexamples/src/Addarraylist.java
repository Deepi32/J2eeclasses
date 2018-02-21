import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class th extends Thread
{
	static int i=0;
	static ArrayList ar=new ArrayList();
	
	public void run()
	{
		Collections.synchronizedList(ar);
		System.out.println(Thread.currentThread().getName()+" "+ar);
		//if(ar==null)
		for(int j=0;j<4;j++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		ar.add(Thread.currentThread().getName());
		}
	}
	public void display()
	{
		synchronized(this)
		{
		System.out.println(Thread.currentThread().getName()+"display");
		Iterator itr=ar.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		System.out.println();
		}
	}


}
public class Addarraylist {
	public static void main(String[] args) throws InterruptedException {
		th t1=new th();
		th t2=new th();
		t1.start();
		t2.start();
	//	t1.yield();
		Thread.sleep(10000);
		t1.display();
		t2.display();
			}

}
