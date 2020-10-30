import java.util.Scanner;
abstract class Quadrilateral//abstract class
{
	int side,length,breadth;
	abstract void area();//abstract method
	abstract void perimeter();//abstract method
	void show()//concrete method
	{
		System.out.println("Number of sides is 4");
	}
}
class Square extends Quadrilateral//concrete class extending abstract class
{
	void area()
	{
		System.out.println("Area is: "+(side*side));
	}
	void perimeter()
	{
		System.out.println("Perimeter is: "+(4*side));
	}
}
class Rectangle extends Quadrilateral
{
	void area()
	{
		System.out.println("Area is: "+(length*breadth));
	}
	void perimeter()
	{
		System.out.println("Perimeter is: "+(2*(length+breadth)));
	}
}
public class AbstractClass3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Quadrilateral quadra=new Square();//quadra is a object used to call concrete class methods
		quadra.side=sc.nextInt();//enter side of a square
		quadra.area();
		quadra.perimeter();
		quadra.show();
		quadra=new Rectangle();//quadra is a object of Rectangle type
		quadra.length=sc.nextInt();//enter length of  rectangle
		quadra.breadth=sc.nextInt();//enter breadth of rectangle
		quadra.area();
		quadra.perimeter();
		quadra.show();
	}		
}