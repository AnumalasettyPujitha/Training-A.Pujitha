import java.util.Scanner;
public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		try {
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		System.out.println("Given string is: "+s);
	}

}
