class MyThread extends Thread
{
	MyThread(ThreadGroup g,String name)
	{
		super(g,name);
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		try
		{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			
		}
		System.out.println(Thread.currentThread().getName()+"done");
	}
}
public class threadgroup {
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup tg=new ThreadGroup("first");
		ThreadGroup t1=new ThreadGroup(tg,"first");
		System.out.println(tg.getParent().getName());
		System.out.println(t1.getParent().getName());
		System.out.println(tg.getMaxPriority());
		tg.setMaxPriority(2);
		System.out.println(t1.getMaxPriority());
		t1.setMaxPriority(7);
		System.out.println(t1.getMaxPriority());
		ThreadGroup tg1=new ThreadGroup("parent group");
		ThreadGroup cg=new ThreadGroup(tg1,"child group");
		MyThread t11=new MyThread(tg1,"child1");
		MyThread t12=new MyThread(tg1,"child2");
		t11.start();
		t12.start();
		System.out.println("count="+tg1.activeCount());
		tg1.list();
		System.out.println("getpriority=="+tg1.getMaxPriority());
		Thread[]t=new Thread[tg1.activeCount()];
		tg1.enumerate(t);
		for(Thread t17:t)
			System.out.println(t17.getName()+" "+t17.isDaemon());
		
	}
}
