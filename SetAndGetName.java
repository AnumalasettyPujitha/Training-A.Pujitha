public class SetAndGetName extends Thread {
	public void run() {
		for(int i=0;i<=10;i++)
			System.out.println(Thread.currentThread().getName()+" is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetAndGetName t1=new SetAndGetName();
		System.out.println(t1.getName());
		t1.setName("FirstThread");
		SetAndGetName t2=new SetAndGetName();
		System.out.println(t2.getName());
		t2.setName("SecondThread");
		t1.start();
		t2.start();
	}

}
