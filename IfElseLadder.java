import java.util.Scanner;
public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		if(number>0)
			if(number%2==0)
				System.out.println(number+" ends with 0 or 2 or 4 or 6 or 8");
			else if(number%3==0)
				System.out.println("sum of the digits in "+number+" is divisible by 3");
			else if(number%5==0)
				System.out.println(number+" ends with 0 or 5");
			else
				System.out.println(number+" is a positive integer");
		else
			System.out.println("Please enter a positive integer");
	}

}
