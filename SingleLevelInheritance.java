import java.util.Scanner;
class Square//super class
{
	int a;
	int square(int a)
	{
		return a*a;
	}
}
class Sum extends Square//sum is sub class
{
	int b;
	int sum(int a,int b)//using super class variable a in subclass
	{
		return a+b;
	}
}
public class SingleLevelInheritance 
{
	public static void main(String args[])
	{
		Sum object=new Sum();//creating object for subclass
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integer values: ");
		object.a=sc.nextInt();
		object.b=sc.nextInt();
		System.out.println("Square of : "+object.a+" is "+object.square(object.a));
		System.out.println("Sum of : "+object.a+","+object.b+" is "+object.sum(object.a,object.b));
	}
}
		
	