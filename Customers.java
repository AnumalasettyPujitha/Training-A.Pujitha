class XeroxShop
{
	void servicesProvided()
	{
		System.out.println("1.Word Xerox  2.Pass Photos  3.Posters  4.Wedding Cards  5.Net Banking");
	}
	int serviceWanted(int a)
	{
		System.out.println("Select a number below 5: ");
		return a;
	}
	void number_of_copies(int a)
	{
		System.out.println("Number of copies : "+a);
	}
	void payBill(int amount)
	{
		System.out.println("Money want to pay : "+amount);
	}
	String payment()
	{
		System.out.println("money is paid");
		return "THANK YOU!";
	}
}
class Customers
{
	public static void main(String args[])
	{
		XeroxShop msflow=new XeroxShop();
		System.out.println("==================msflow=============");
		msflow.servicesProvided();
		System.out.println("Your choice is: "+msflow.serviceWanted(3));
		msflow.number_of_copies(120);
		msflow.payBill(240);
		System.out.println(msflow.payment());
		XeroxShop msflew=new XeroxShop();
		System.out.println("==================msflew=============");
		msflew.servicesProvided();
		System.out.println("Your choice is: "+msflew.serviceWanted(5));
		msflew.number_of_copies(100);
		msflew.payBill(240);
		System.out.println(msflew.payment());
	}
}