class Restaurant
{
	void menu()//method with no return type and no parameters
	{
		System.out.println("1.Idly 2.Dosa 3.poori 4.chapathi");
	}
	void takeOrder(String order)//method with no return type and with parameter
	{
		System.out.println("Order given is: "+order);
	}
	String serveFood()//method with return type and no parameters
	{
		return "poori";
	}
	int giveBill()//method with return type and no parameters
	{
		return 120;
	}
	String payBill(int amount)//method with return type and  parameters
	{
		System.out.println("Amount given is "+amount);
		return "paid";
	}
}
public class Customer
{
	public static void main(String args[])
	{
		Restaurant dominos=new Restaurant();
		System.out.println("=============Dominos details============");
		dominos.menu();
		dominos.takeOrder("poori");
		System.out.println(dominos.serveFood());
		System.out.println(dominos.giveBill());
		System.out.println(dominos.payBill(120));
		Restaurant nalabheem=new Restaurant();
		System.out.println("=============Nalabheem details============");
		nalabheem.menu();
		nalabheem.takeOrder("poori");
		System.out.println(nalabheem.serveFood());
		System.out.println(nalabheem.giveBill());
		System.out.println(nalabheem.payBill(120));
	}
}

	