import java.util.Scanner;
abstract class Mobile//abstract class
{
	int memory_capacity;
	abstract void camera();//abstract method
	void show()//concrete method
	{
		System.out.println("memory power is: "+memory_capacity);
	}
}
class Apple extends Mobile
{
	void camera()//overriding abstract method
	{
		System.out.println("30pixels");
	}
}
class Moto extends Mobile
{
	void camera()
	{
		System.out.println("15pixels");
	}
}
public class AbstractClass1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Mobile mobile=new Apple();//mobile object is type of Mobile and used for Apple class
		mobile.memory_capacity=sc.nextInt();//enter capacity of apple mobile
		mobile.camera();
		mobile.show();
		mobile=new Moto();//mobile object is type of Moto
		mobile.memory_capacity=sc.nextInt();//storing capacity of moto mobile
		mobile.camera();
		mobile.show();
	}
}