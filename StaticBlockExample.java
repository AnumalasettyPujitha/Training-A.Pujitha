public class StaticBlockExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Block");
	}
	static {
		System.out.println("Static Block");//it should be printed first before static method
	}
}
