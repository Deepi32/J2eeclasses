class MyThread112 extends Thread
{
	public void run()
	{
		System.out.println("MyThread is working.......................");
		
	}

}
public class trynot {
	public static void main(String args[]){  
		MyThread112 t1=new MyThread112();
		Thread t2=new Thread(t1);
		t2.start();
		System.out.println("Main Thread is working....................");
		}

}
