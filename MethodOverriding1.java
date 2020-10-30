class Car
{
	void cost()
	{
		System.out.println("No Cost");
	}
	void milage()
	{
		System.out.println("No Milage");
	}
}
class Audi extends Car
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
public class MethodOverriding1
{
	public static void main(String args[])
	{
		Car car=new Car();
		car.cost();
		car.milage();
		car=new Audi();
		car.cost();
		car.milage();
		car=new Safaari();
		car.cost();
		car.milage();
	}
}