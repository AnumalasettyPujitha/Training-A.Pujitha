public class SleepMethod extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);//the thread will wait till 1000 milliseconds
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(System.nanoTime()+" "+i);//it shows the time difference that is 10000 milliseconds
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepMethod thread=new SleepMethod();
		thread.start();
	}
}
