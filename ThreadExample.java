class MyThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		mt.start();
	}

}
