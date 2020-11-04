import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int fact=1;
		while(num>1) {
			fact*=num;
			num--;
		}
		System.out.println("Factorial of the given number is "+fact);

	}

}
