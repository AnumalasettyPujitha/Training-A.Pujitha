import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("Sum of the digits: "+sum);
	}

}
