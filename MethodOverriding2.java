import java.util.Scanner;
class Quadrilateral
{
	int side,length,breadth;
	void area()
	{
		System.out.println("Area is: "+0);
	}
	void perimeter()
	{
		System.out.println("Perimeter is: "+0);
	}
}
class Square extends Quadrilateral
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
public class MethodOverriding2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Quadrilateral quadra=new Quadrilateral();//quadra is a object of quadrilateral type
		quadra.area();
		quadra.perimeter();
		quadra=new Square();//quadra is a object of Square type
		quadra.side=sc.nextInt();
		quadra.area();
		quadra.perimeter();
		quadra=new Rectangle();//quadra is a object of Rectangle type
		quadra.length=sc.nextInt();
		quadra.breadth=sc.nextInt();
		quadra.area();
		quadra.perimeter();
	}		
}