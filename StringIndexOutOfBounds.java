import java.util.Scanner;
public class StringIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		try {
			for(int i=0;i<=s.length();i++) {
				System.out.print(s.charAt(i));
			}
		}
		catch(StringIndexOutOfBoundsException sie) {
			sie.printStackTrace();
		}
		System.out.println("Given word is "+s);
	}

}
