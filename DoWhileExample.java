import java.util.Scanner;
public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int sum=0;
		do {
			System.out.println(num);
			sum=sum+num;
			num--;
		}while(num>0);
		System.out.println("Sum is "+sum);
	}

}
