class Example1{
	static {
		System.out.println("Static Block");
	}
}
public class ForNameMethod {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("Example1");
		System.out.println("ForName Main Method");
	}
}
