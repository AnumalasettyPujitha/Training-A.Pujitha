abstract class Vehicle{
	abstract void milage();
	abstract void cost();
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle cycle=new Vehicle() {
			void milage() {
				System.out.println("Milage of the cycle is 2km");
			}
			void cost() {
				System.out.println("Cost of the cycle is 8000/-");
			}
		};
		Vehicle car=new Vehicle() {
			void milage() {
				System.out.println("Milage of the car is 15km");
			}
			void cost() {
				System.out.println("Cost of the car is 48000/-");
			}
		};
		cycle.milage();
		cycle.cost();
		car.milage();
		car.cost();
	}

}
