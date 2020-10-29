class Area
{
	double area(float radius)//to calculate area of circle
	{
		return (3.14*radius*radius);
	}
	int area(int side)//to calculate area of square
	{
		return side*side;
	}
	float area(float length,float breadth)//to calculate area of rectangle
	{
		return length*breadth;
	}
	double area(float base,float height,float side)//to calculate area of triangle
	{
		return (0.5*base*height);
	}
}
public class MethodOverloading3
{
	public static void main(String args[])
	{
		Area geometry=new Area();
		System.out.println("Area of circle is: "+geometry.area(10f));
		System.out.println("Area of square is: "+geometry.area(20));
		System.out.println("Area of rectangle is: "+geometry.area(10f,20f));
		System.out.println("Area of triangle is: "+geometry.area(1f,10f,20f));
	}
}
		
	
	