class Customer{
	int amount=10000;
	synchronized void withDraw(int amount) {
		System.out.println("going to withdraw....");
		if(this.amount<amount) {
			System.out.println("less balance go and deposit");
			try {
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("Withdrawl completed");
	}
	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount+=amount;
		System.out.println("deposit done");
		notify();
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer rahul=new Customer();
		new Thread() {
			public void run() {
				rahul.withDraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				rahul.deposit(20000);
			}
		}.start();
	}

}
