import java.util.Scanner;
public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try {
			System.out.println("Quotient is : "+(num1/num2));
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		finally {
			sc.close();
		}
		System.out.println("Sum is : "+(num1+num2));
		System.out.println("Difference is : "+(num1-num2));
		System.out.println("Product is : "+(num1*num2));
	}

}
