class Example implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i value is: "+i);
		}
	}
}
public class RunnableExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex=new Example();
		Thread t=new Thread(ex);
		t.start();
		for(int j=0;j<=10;j++)
			System.out.println("j value is: "+j);
	}
}
