
public class ThreadLocalExample {
	public static class MyRunnable implements Runnable {
		private volatile int k=1;
        private ThreadLocal<Integer> threadLocal =
               new ThreadLocal<Integer>();

        @Override
        public void run() {
            threadLocal.set( (int) (k++) );
            for(int i=1;i<5;i++) {
            System.out.println("Thread Name :"+Thread.currentThread().getName()+"value is:::"+threadLocal.get());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
    
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MyRunnable sharedRunnableInstance = new MyRunnable();

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);
        
        
        thread1.start();
        thread2.start();

        thread1.join(); //wait for thread 1 to terminate
        thread2.join(); //wait for thread 2 to terminate
    }

}
