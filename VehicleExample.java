import java.util.*;
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
class VehicleExample
{
	public static void main(String args[])
	{
		Vehicle car=new Vehicle();//to store car details
		car.type="CAR";
		car.company_name="MARUTHI";
		car.no_of_wheels=4;
		car.no_of_seats=6;
		car.vehicle_number="AP26AT3219";
		car.owner_name="Amar";
		car.driver_name=car.owner_name;
		car.market_price=12000;
		car.discount_percentage=15;
		car.warranty=2;
		car.colour="blue";
		System.out.println("=======vehicle: "+car.type+" Details======");
		System.out.println("company name is: "+car.company_name);
		System.out.println("final price of the vehicle is :"+((car.market_price)-(car.market_price*car.discount_percentage/100)));
		Vehicle scooty=new Vehicle();//to store scooty details
		scooty.type="Scooter";
		scooty.market_price=15000;
		System.out.println("=======vehicle: "+scooty.type+" Details======");
		System.out.println("company name is: "+scooty.company_name);
		System.out.println("final price of the vehicle is :"+((scooty.market_price)-(scooty.market_price*scooty.discount_percentage/100)));
		System.out.println("warranty of vehicle is: "+scooty.warranty+" years ");
	}
}