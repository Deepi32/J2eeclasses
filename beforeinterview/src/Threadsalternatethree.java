
public class Threadsalternatethree {
	static Object object=new Object();
	static boolean one=true;
	static boolean two=false;
	static boolean three=false;
	static int count=1;
	public static void main(String args[])
	{
		Thread t1=new Thread(new ThreadsAll(1));
		Thread t2=new Thread(new ThreadsAll(2));
		Thread t3=new Thread(new ThreadsAll(3));
		t1.start();
		t2.start();
		t3.start();
	}
static class ThreadsAll implements Runnable
{
	int threadid;
	ThreadsAll(int id)
	{
		threadid=id;
	}
	public void run()
	{
		while(count<15)
		synchronized(object)
		{
			if(threadid==1)
			{
				if(one)
				{
					System.out.println(Thread.currentThread().getName()+" "+count);
					count++;
					one=false;
					two=true;
					three=false;
					object.notifyAll();
				} else
					try {
						object.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			if(threadid==2)
			{
				if(two)
				{
					System.out.println(Thread.currentThread().getName()+" "+count);
					count++;
					one=false;
					two=false;
					three=true;
					object.notifyAll();
				} else
					try {
						object.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			 if(threadid==3)
			{
				if(three)
				{
					System.out.println(Thread.currentThread().getName()+" "+count);
					count++;
					one=true;
					two=false;
					three=false;
					object.notifyAll();
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
}
