public class ThreadPriority extends Thread {
	public void run() {
		System.out.println("Thread name "+Thread.currentThread().getName());
		System.out.println("Thread priority "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority thread1=new ThreadPriority();
		ThreadPriority thread2=new ThreadPriority();
		thread1.setPriority(1);
		thread2.setPriority(10);
		thread1.start();
		thread2.start();
	}

}
