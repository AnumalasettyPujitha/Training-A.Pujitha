interface Vehicle
{
	void cost();
	void milage();
	void start();
}
abstract class BiCycle implements Vehicle//abstract classes implements interface
{
	abstract public void cost();
	abstract public void milage();
	public void start()
	{
		System.out.println("For bicycle there is no need of key to start");
	}
}
abstract class Car implements Vehicle
{
	abstract public void cost();
	abstract public void milage();
	public void start()
	{
		System.out.println("For car there is  need of key to start");
	}
}
class HeroCycle extends BiCycle//sub class extending the properties of abstract class
{
	public void cost()
	{
		System.out.println("HeroCycle cost is 15,000");
	}
	public void milage()
	{
		System.out.println("HeroCycle Milage is 1km");
	}
}
class ButterFly extends BiCycle
{
	public void cost()
	{
		System.out.println("ButterFly cost is 14,000");
	}
	public void milage()
	{
		System.out.println("ButterFly Milage is 2km");
	}
}
class Audi extends Car//sub class extending the properties of abstract class
{
	public void cost()
	{
		System.out.println("Audi cost is 50lakhs");
	}
	public void milage()
	{
		System.out.println("Audi Milage is 15km");
	}
}
class Safaari extends Car
{
	public void cost()
	{
		System.out.println("Safaari cost is 40lakhs");
	}
	public void milage()
	{
		System.out.println("Safaari Milage is 10km");
	}
}
public class Interface1
{
	public static void main(String args[])
	{
		BiCycle cycle=new HeroCycle();//creating object for BiCycle class
		cycle.start();
		cycle.milage();
		cycle.cost();
		cycle=new ButterFly();
		cycle.start();
		cycle.milage();
		cycle.cost();
		Car car=new Audi();//creating object for Car class
		car.start();
		car.cost();
		car.milage();
		car=new Safaari();
		car.start();
		car.cost();
		car.milage();
	}
}