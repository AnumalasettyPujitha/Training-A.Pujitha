class Value{
	private int a=30;
	void value() {
		System.out.println("value is: "+a);
		class Inner{
			void show() {
				int b=20;
				System.out.println("Sum of a,b is "+(a+b));
			}
		}
		Inner inn=new Inner();
		inn.show();
	}
}
public class LocalInnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value outer=new Value();
		outer.value();
	}

}
