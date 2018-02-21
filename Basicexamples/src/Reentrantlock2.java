import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Display
{
	ReentrantLock rl=new ReentrantLock();
	public  void displ()
	{
		try {
			rl.tryLock(5000,TimeUnit.MILLISECONDS);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0;i<10;i++){
			System.out.print("Gud Mrng ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//System.out.println(name);
		}
		rl.unlock();
	}
	public void displev()
	{
		rl.tryLock();
		for(int i=0;i<10;i++){
			System.out.print("Gud evng ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(name);
		}
		rl.unlock();
	}
}
class MyThread11 extends Thread
{
	Display d;
	String name;
	MyThread11(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.displ();
	}


}
class MyThread12 extends Thread
{
	Display d;
	String name;
	MyThread12(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.displev();
	}


}
public class Reentrantlock2 {
	public static void main(String[] args) {
		Display d1=new Display();
		Display d2=new Display();
		
		MyThread11 t1=new MyThread11(d1,"deeps");
		MyThread12 t2=new MyThread12(d1,"jyoti");
		t1.start();
		t2.start();
	}

}
