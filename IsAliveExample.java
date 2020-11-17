public class IsAliveExample extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running: ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsAliveExample t1=new IsAliveExample();
		t1.start();
		System.out.println("t1 is alive "+t1.isAlive());
		IsAliveExample t2=new IsAliveExample();
		t2.start();
		System.out.println("t2 is alive "+t2.isAlive());
		IsAliveExample t3=new IsAliveExample();
		t3.start();
		System.out.println("t3 is alive "+t3.isAlive());
		System.out.println("t1 is alive "+t1.isAlive());
		System.out.println("t2 is alive "+t2.isAlive());
		System.out.println("t3 is alive "+t3.isAlive());
		System.out.println("After threads execution completed: ");
	}

}
