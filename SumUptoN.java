import java.util.Scanner;

public class SumUptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			sum+=num;
			num--;
		}
		System.out.println("Sum of the numbers upto the given number is "+sum);

	}

}
