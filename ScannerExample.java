import java.util.Scanner;
class Vehicle
{
	String type;
	String company_name;
	int no_of_wheels;
	int no_of_seats;
	String vehicle_number;
	String owner_name;
	String driver_name;
	int market_price;
	static int discount_percentage;
	static float warranty;
	String colour;
}
public class ScannerExample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vehicle car=new Vehicle();//to store car details
		car.type=sc.next();
		car.company_name=sc.next();
		car.no_of_wheels=sc.nextInt();
		car.no_of_seats=sc.nextInt();
		car.vehicle_number=sc.next();
		car.owner_name=sc.next();
		car.driver_name=car.owner_name;
		car.market_price=sc.nextInt();
		car.discount_percentage=sc.nextInt();
		car.warranty=sc.nextFloat();
		car.colour=sc.next();
		System.out.println("=======vehicle: "+car.type+" Details======");
		System.out.println("company name is: "+car.company_name);
		System.out.println("final price of the vehicle is :"+((car.market_price)-(car.market_price*car.discount_percentage/100)));
		Vehicle scooty=new Vehicle();//to store scooty details
		scooty.type=sc.next();;
		scooty.market_price=sc.nextInt();
		System.out.println("=======vehicle: "+scooty.type+" Details======");
		System.out.println("company name is: "+scooty.company_name);
		System.out.println("final price of the vehicle is :"+((scooty.market_price)-(scooty.market_price*scooty.discount_percentage/100)));
		System.out.println("warranty of vehicle is: "+scooty.warranty+" years ");
	}
}