import java.util.Scanner;
class Electronics//super class
{
	float weight;
	String type;
	void features()
	{
		System.out.println("weight of the device is: "+weight);
		System.out.println("Type of the device is: "+type);
	}
}
class Calculator extends Electronics//calculator is subclass of electronics
{
	int a,b;
	void sum()
	{
		System.out.println("Sum is: "+(a+b));
	}
	void sub()
	{
		System.out.println("Difference is: "+(a-b));
	}
}
class Casio extends Calculator//casio is subclass of  calculator
{
	int number_of_buttons;
	int number_of_operations;
	void square()
	{
		System.out.println("Square is: "+(a*a));
	}
}
public class MultiLevelInheritance 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Casio object=new Casio();//object is the subclass object used to call all the properties
		System.out.println("enter weight of the electronics: ");
		object.weight=sc.nextFloat();
		System.out.println("enter type of the electronics: ");
		object.type=sc.next();
		System.out.println("enter two integer values: ");
		object.a=sc.nextInt();
		object.b=sc.nextInt();
		System.out.println("enter number of buttons and number of operations performed by electronics: ");
		object.number_of_buttons=sc.nextInt();
		object.number_of_operations=sc.nextInt();
		object.features();
		object.sum();
		object.sub();
		object.square();
		System.out.println("number of buttons and number of operations performed by electronics are: "+object.number_of_buttons+", "+object.number_of_operations);
	}
}