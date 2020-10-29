class Calculator
{
	int x=10,y=15;
	void show()
	{
		System.out.println("Variables of calculator: "+x+" "+y);
	}
	int add(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
	int absoluteValue(int a)
	{
		if(a<0)
		   a=-a;
		else
		   a=a;
		return a;
	}
	void increment(int a)
	{
		System.out.println("a value is: "+(++a));
	}
	int showx()
	{
		return x;
	}
	int showy()
	{
		return y;
	}
}
public class User
{
	public static void main(String args[])
	{
		Calculator user_mani=new Calculator();
		System.out.println("===========User1 Details==============");
		user_mani.show();
		System.out.println("Sum is: "+user_mani.add(10,20));
		System.out.println("Difference is: "+user_mani.sub(10,20));
		System.out.println("Absolute value is: "+user_mani.absoluteValue(-10));
		user_mani.increment(10);
		System.out.println("x value of calculator is: "+user_mani.showx());
		System.out.println("y value of calculator is: "+user_mani.showy());
		Calculator user_manu=new Calculator();
		System.out.println("===========User2 Details==============");
		user_manu.show();
		System.out.println("Sum is: "+user_manu.add(10,20));
		System.out.println("Difference is: "+user_manu.sub(10,20));
		System.out.println("Absolute value is: "+user_manu.absoluteValue(10));
		user_manu.increment(10);
		System.out.println("x value of calculator is: "+user_manu.showx());
		System.out.println("y value of calculator is: "+user_manu.showy());

	}
}