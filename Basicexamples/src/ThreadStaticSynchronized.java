/*
 * if static synchronized method is running other methods like synchronized, normal method can run but not stat
 * static synchronized methods.
  
 * */




class MyThread1
{
	void display1(String str)
	{
		System.out.println("i m plain method"+str);
		for(int i=65;i<=70;i++)
		{	System.out.println((char)i+"display1 "+str);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
	
}
class MyThread2
{
	synchronized void display2(String str)
	{
		System.out.println("i m static void display2 method"+str);
		for(int i=65;i<=70;i++){
			System.out.println((char)i+" display2 "+str);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
	
}
class MyThread3
{
	static synchronized void display3(String str)
	{
		System.out.println("i m static synchronized void display3 method"+str);
		for(int i=65;i<=70;i++){
			System.out.println((char)i+" display3 "+str);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
class mythreadad extends Thread
{
	MyThread1 m1;
	String str;
	mythreadad(MyThread1 m1,String str)
	{
		this.m1=m1;
		this.str=str;
	}
	public void run()
	{
		m1.display1(str);
	}
}
class mythreadad1 extends Thread
{
	MyThread2 m1;
	String str;
	mythreadad1(MyThread2 m1,String str)
	{
		this.m1=m1;
		this.str=str;
	}
	public void run()
	{
		m1.display2(str);
	}
}
class mythreadad3 extends Thread
{
	MyThread3 m1;
	String str;
	mythreadad3(MyThread3 m1,String str)
	{
		this.m1=m1;
		this.str=str;
	}
	public void run()
	{
		m1.display3(str);
	}
}
public class ThreadStaticSynchronized {
	public static void main(String[] args) {
		MyThread1 m1=new MyThread1();
		//MyThread1 m2=new MyThread1();
	//	mythreadad t1=new mythreadad(m1,"first");
		//t1.start();
		//mythreadad t2=new mythreadad(m1,"second");
		//t2.start();
		MyThread2 m2=new MyThread2(); 
		MyThread2 m3=new MyThread2();
		mythreadad1 t3=new mythreadad1(m2,"third");
		t3.start();
		mythreadad1 t4=new mythreadad1(m3,"fourth");
		t4.start();
		MyThread3 m5=new MyThread3(); 
		MyThread3 m6=new MyThread3();
		mythreadad3 t5=new mythreadad3(m5,"fifth");
		t5.start();
		mythreadad3 t6=new mythreadad3(m6,"sixth");
		t6.start();

	}

}
