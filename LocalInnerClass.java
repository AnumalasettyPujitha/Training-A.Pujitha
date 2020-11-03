public class LocalInnerClass {
	public void method() {
		class Inner{
			public void add(int a,int b)
			{
				System.out.println("Sum is: "+(a+b));
			}
		}
		Inner inner=new Inner();
		inner.add(2, 3);
		System.out.println("Method of outer class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass local=new LocalInnerClass();
		local.method();//calling outer class method executes the inner class method also
	}

}
