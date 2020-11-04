import java.util.Scanner;
public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		if(n>0) {
			if(n%10==0)
				System.out.println(n+" ends with zero");
			else
				System.out.println(n+" does not ends with zero");
		}
		else
			System.out.println("Please enter a positive number");
	}

}
