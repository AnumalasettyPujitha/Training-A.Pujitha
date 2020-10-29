import java.util.Scanner;
class Geometry
{
	String shape;
	int number_of_sides;
	int length;
	float breadth;
	float height;
	double area;
	float perimeter;
	int number_of_diagonals;
}
public class ScannerExample3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Geometry square=new Geometry();
		square.shape=sc.next();
		square.number_of_sides=sc.nextInt();
		square.length=sc.nextInt();
		square.breadth=sc.nextFloat();
		square.height=sc.nextFloat();
		square.area=sc.nextDouble();
		square.perimeter=square.length+square.breadth+square.height;
		square.number_of_diagonals=sc.nextInt();
		System.out.println("============square=======");
		System.out.println(square.shape);
		System.out.println(square.number_of_sides);
		System.out.println(square.area);
		System.out.println(square.perimeter);
		System.out.println(square.number_of_diagonals);
	}
}