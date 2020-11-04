import java.util.Scanner;

public class ForExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int sum=0;
		for(int num=sc.nextInt();num>0;num=num/10) {
			int rem=num%10;
			sum+=rem;
		}
		System.out.println("Sum of the digits: "+sum);

	}

}
