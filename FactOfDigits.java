import java.util.Scanner;
public class FactOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			int fact=1;
			while(rem>0) {
				fact*=rem;
				rem--;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum)
			System.out.println(temp+","+sum+" are same");
		else
			System.out.println(temp+","+sum+" are not same");
	}
}
