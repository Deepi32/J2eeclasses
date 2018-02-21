import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable
{
	int num;
	MyCallable(int num)
	{
		this.num=num;
	}
	public Object call()throws Exception
	{
		System.out.println(Thread.currentThread().getName()+"is responsibl to find sum of first"+num+"numbers");
		int sum=0;
		for(int i=1;i<=num;i++)
			sum+=i;
		return sum;
	}
}
public class Callablejob {
	public static void main(String[] args) {
		MyCallable[] calls={new MyCallable(10),new MyCallable(20),new MyCallable(30)};
		ExecutorService er=Executors.newFixedThreadPool(2);
		for(MyCallable m:calls)
		{
			Future f=er.submit(m);
			try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		er.shutdown();
	}

}
