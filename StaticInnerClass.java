class Outer{
	int addition(int a,int b) {
		return a+b;
	}
	static class Inner{
		static int subtraction(int a,int b) {
			return a-b;
		}
	}
	static class Inner2{
		static int multiplication(int a,int b) {
			return a*b;
		}
	}
}
public class StaticInnerClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer=new Outer();
		System.out.println("Sum is: "+outer.addition(2, 5));
		System.out.println("Difference is: "+Outer.Inner.subtraction(5,2));
		System.out.println("Product is: "+Outer.Inner2.multiplication(5,2));
	}

}
