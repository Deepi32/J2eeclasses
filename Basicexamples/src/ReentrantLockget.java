import java.util.concurrent.locks.ReentrantLock;


public class ReentrantLockget {

	
	public static void main(String[] args) {
		ReentrantLock l=new ReentrantLock();
		l.lock();
		l.lock();
		System.out.println("islocked=="+l.isLocked());
		System.out.println("Held by current thread=="+l.isHeldByCurrentThread());
		System.out.println("count of holded=="+l.getHoldCount());
		System.out.println("Length of queue=="+l.getQueueLength());
		l.unlock();
		System.out.println("After unlock count of holded=="+l.getHoldCount());
		System.out.println("islocked=="+l.isLocked());
		l.unlock();

	}

}
