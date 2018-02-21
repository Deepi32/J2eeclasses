class MyThread extends Thread
{
	public void run()
	{
		Thread.yield();
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName()+" "+i);
		System.out.println(Thread.currentThread().getName()+" done");
	}

}
public class threadyieldwaitsleep {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1=new MyThread();
		t1.setName("CHild");
		t1.start();
	//	Thread.currentThread().join(1000,10);
		//	Thread.currentThread().yield();
		
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName()+" "+i);
	}

}
