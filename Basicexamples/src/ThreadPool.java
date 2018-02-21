import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class AE implements Runnable
{
	String name;
	AE(String name)
	{
		this.name=name;
	}
	public void run()
	{
		System.out.println(name+"job started by "+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{}
		System.out.println(name+"job completed by "+Thread.currentThread().getName());
		
	}
}
public class ThreadPool {
	public static void main(String[] args) {
		AE[] jobs={ new AE("deeps"),new AE("jyoti"),new AE("hl"),new AE("jojo")};
		ExecutorService service=Executors.newFixedThreadPool(2);
		for (AE a:jobs)
		{
			service.submit(a);
		}
		service.shutdown();
	}

}
