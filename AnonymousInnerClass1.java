abstract class Fruit{
	abstract void colour();
	abstract void weight();
}
public class AnonymousInnerClass1 {
public static void main(String args[]) {
	Fruit apple=new Fruit() {
		void colour() {
			System.out.println("Apple is in red colour");
		}
		void weight() {
			System.out.println("Apple is 250 grams");
		}
	};
	apple.colour();
	apple.weight();
}
}
