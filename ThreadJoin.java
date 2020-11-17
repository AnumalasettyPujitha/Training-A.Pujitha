import java.util.Scanner;
public class ThreadJoin extends Thread{
	Scanner sc=new Scanner(System.in);
	int x,y;
	public void run() {
		x=sc.nextInt();
		y=sc.nextInt();
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin tj=new ThreadJoin();
		tj.start();
		tj.join();// if join is not used here the sum is zero
		System.out.println("SUM is: "+(tj.x+tj.y));
	}

}
