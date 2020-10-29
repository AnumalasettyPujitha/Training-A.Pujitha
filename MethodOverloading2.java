class Display
{
	void display(int a)
	{
		System.out.println("This is no return type method of integer "+a);
	}
	void display(int a,int b)
	{
		System.out.println("This is no return type method of integer sum"+(a+b));
	}
	void display(float a)
	{
		System.out.println("This is no return type method of float "+a);
	}
	void display(float a,float b)
	{
		System.out.println("This is no return type method of float sum "+(a+b));
	}
	String display(String a)
	{
		System.out.println("Method of string type:");
		return a;
	}
	char display(char a)
	{
		System.out.println("Character is: ");
		return a;
	}
}
public class MethodOverloading2
{
	public static void main(String args[])
	{
		Display disp=new Display();
		//calling display method in various forms using disp object
		disp.display(10);
		disp.display(10,20);
		disp.display(2.5f);
		disp.display(2.5f,3.5f);
		System.out.println(disp.display("Hi"));
		System.out.println(disp.display('a'));
	}
}