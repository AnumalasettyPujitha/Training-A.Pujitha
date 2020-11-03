public class MemberInnerClass {
	void give(int a) {
		System.out.println("The value is : "+a);
	}
	class Inner{
		void accept(int b) {
			System.out.println("Accept the value : "+b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInnerClass outer=new MemberInnerClass();
		outer.give(5);//calling outer class method 
		MemberInnerClass.Inner inn=outer.new Inner();
		inn.accept(5);//calling inner class method
	}

}
