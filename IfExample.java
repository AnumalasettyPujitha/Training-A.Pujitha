import java.util.Scanner;
public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		System.out.print("absolute value of "+num+" is ");
		if(num<0)
			num=-num;//to make the negative number positive
		System.out.print(num);
	}

}
