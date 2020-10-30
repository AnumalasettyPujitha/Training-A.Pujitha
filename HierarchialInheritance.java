class Geometry//super class
{
	String shape;
	void show()
	{
		System.out.println("Shape of the Geometry is: "+shape);
	}
}
class Circle extends Geometry//circle is subclass of Geometry
{
	int radius;
	void area()
	{
		System.out.println("Area is: "+(3.14*radius*radius));
	}
}
class Square extends Geometry//Square is subclass of Geometry
{
	int side;
	void perimeter()
	{
		System.out.println("Perimeter is: "+(4*side));
	}
}
public class HierarchialInheritance	
{
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.shape="Circle";
		c.show();
		c.radius=5;
		c.area();
		Square s=new Square();
		s.shape="Square";
		s.show();
		s.side=10;
		s.perimeter();
	}
}