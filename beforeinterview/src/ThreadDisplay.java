//Alternate threads ....................

public class ThreadDisplay {
	 static Object object = new Object();
	static int counter=0;
	public static void main(String args[])
	{
		Thread t1=new Thread(new evenThread(),"EvenThread");
		Thread t2=new Thread(new oddThread(),"OddThread");
		
		t1.start();
		t2.start();
		
		
	}


static class evenThread implements Runnable
{
	public void run()
	{
		while(counter<=10)
		synchronized(object)
		{
			if(counter%2==0)
			{
				System.out.println(counter+" "+Thread.currentThread().getName());
				counter++;
				object.notify();
			} else
				try {
					object.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
static class oddThread implements Runnable
{
	public void run()
	{
		while(counter<=10)
		synchronized(object)
		{
			if(counter%2!=0)
			{
				System.out.println(counter+" "+Thread.currentThread().getName());
				counter++;
				object.notify();
			} else
				try {
					object.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
}