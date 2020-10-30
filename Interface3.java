interface Animal
{
	void living_place();
	void life_span();
	void weight();
}
abstract class WildAnimal implements Animal//WildAnimal is a abstract class implementing Animal Interface
{
	abstract public void life_span();
	abstract public void weight();
	public void living_place()
	{
		System.out.println("Wild animals live in forests");
	}
}
abstract class DomesticAnimal implements Animal//DomesticAnimal is a abstract class implementing Animal Interface
{
	abstract public void life_span();
	abstract public void weight();
	public void living_place()
	{
		System.out.println("Domestic animals live in houses");
	}
}
class Tiger extends WildAnimal//Tiger is a class extending WildAnimal class
{
	public void weight()
	{
		System.out.println("Weight of Tiger is 60kg");
	}
	public void life_span()
	{
		System.out.println("life_span of tiger is 20 years");
	}
}
class Deer extends WildAnimal//Deer is a class extending WildAnimal class
{
	public void weight()
	{
		System.out.println("Weight of deer is 40kg");
	}
	public void life_span()
	{
		System.out.println("life_span of deer is 15 years");
	}
}
class Cat extends DomesticAnimal//Cat is a class extending DomesticAnimal class
{
	public void weight()
	{
		System.out.println("Weight of cat is 15kg");
	}
	public void life_span()
	{
		System.out.println("life_span of cat is 10 years");
	}
}
class Dog extends DomesticAnimal//Dog is a class extending DomesticAnimal class
{
	public void weight()
	{
		System.out.println("Weight of dog is 20kg");
	}
	public void life_span()
	{
		System.out.println("life_span of dog is 15 years");
	}
}
public class Interface3
{
	public static void main(String args[])
	{
		WildAnimal wild=new Tiger();//creating object for calling tiger details
		wild.living_place();
		wild.weight();
		wild.life_span();
		wild=new Deer();//creating object for calling deer details
		wild.living_place();
		wild.weight();
		wild.life_span();
		DomesticAnimal domestic=new Cat();//creating object for calling cat details
		domestic.living_place();
		domestic.weight();
		domestic.life_span();
		domestic=new Dog();//creating object for calling dog details
		domestic.living_place();
		domestic.weight();
		domestic.life_span();
	}
}
