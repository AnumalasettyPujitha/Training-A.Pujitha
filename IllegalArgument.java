import java.util.Scanner;
public class IllegalArgument {
	static void add(float a,float b) {
		System.out.println("Sum is: "+(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
				add(sc.nextFloat(),sc.nextFloat());
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error is : ");
			e.printStackTrace();
		}
		finally {
			System.out.println("Reached end of the file");
		}
	}

}
