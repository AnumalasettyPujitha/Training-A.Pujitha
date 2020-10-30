abstract class Car//abstract class
{
	void show()//concrete method
	{
		System.out.println("number of wheels are 4");
	}
	abstract void cost();//abstract method
	abstract void milage();//abstract method
}
class Audi extends Car//sub class extending the properties of abstract class
{
	void cost()
	{
		System.out.println("Audi cost is 50lakhs");
	}
	void milage()
	{
		System.out.println("Audi Milage is 15km");
	}
}
class Safaari extends Car
{
	void cost()
	{
		System.out.println("Safaari cost is 40lakhs");
	}
	void milage()
	{
		System.out.println("Safaari Milage is 10km");
	}
}
public class AbstractClass2
{
	public static void main(String args[])
	{
		Car car=new Audi();//creating object
		car.show();
		car.cost();
		car.milage();
		car=new Safaari();
		car.show();
		car.cost();
		car.milage();
	}
}