import java.util.Scanner;

public class ForExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int fact=1;
		for(int num=sc.nextInt();num>1;fact*=num,num--); 
		System.out.println("Factorial of the given number is "+fact);
	}

}
