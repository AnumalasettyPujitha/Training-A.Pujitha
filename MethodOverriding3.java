import java.util.Scanner;
class Mobile
{
	int memory_capacity;
	void camera()
	{
		System.out.println("default pixels");
	}
	void show()
	{
		System.out.println("memory power is: "+memory_capacity);
	}
}
class Apple extends Mobile
{
	void camera()
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
public class MethodOverriding3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Mobile mobile=new Mobile();//mobile object is type of Mobile
		mobile.memory_capacity=sc.nextInt();
		mobile.camera();
		mobile.show();
		mobile=new Apple();//mobile object is type of Apple
		mobile.memory_capacity=sc.nextInt();
		mobile.camera();
		mobile.show();
		mobile=new Moto();//mobile object is type of Moto
		mobile.memory_capacity=sc.nextInt();
		mobile.camera();
		mobile.show();
	}
}