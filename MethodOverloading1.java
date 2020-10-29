class Calculator
{
	int add(int a,int b)//to add two integer variables
	{
		return a+b;
	}
	int add(int a,int b,int c)//to add three integer variables
	{
		return a+b+c;
	}
	float add(float a,float b)//to add two float variables
	{
		return a+b;
	}
	float add(float a,float b,float c)//to add three float variables
	{
		return a+b+c;
	}
	double add(double a,double b)//to add two double variables
	{
		return a+b;
	}
	double add(double a,double b,double c)//to add three double variables
	{
		return a+b+c;
	}
}
public class MethodOverloading1
{
	public static void main(String args[])
	{
		Calculator calci=new Calculator();
		System.out.println("sum of 2 numbers is: "+calci.add(2,5));
		System.out.println("sum of 3 numbers is: "+calci.add(2,5,7));
		System.out.println("sum of 2 numbers is: "+calci.add(2.5,5.5));
		System.out.println("sum of 3 numbers is: "+calci.add(2.5,5.4,7.5));
		System.out.println("sum of 2 numbers is: "+calci.add(2.5d,3.5d));
		System.out.println("sum of 3numbers is: "+calci.add(2.5d,5.4d,7.6d));
	}
}