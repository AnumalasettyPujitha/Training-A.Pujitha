interface HumanBeing
{
	void hair();
	void height();
	void weight();
}
abstract class Man implements HumanBeing//Man is a abstract class implementing HumanBeing Interface
{
	abstract public void height();
	abstract public void weight();
	public void hair()
	{
		System.out.println("men has less hair");
	}
}
abstract class Woman implements HumanBeing//Woman is a abstract class implementing HumanBeing Interface
{
	abstract public void height();
	abstract public void weight();
	public void hair()
	{
		System.out.println("women has more hair");
	}
}
class Ravi extends Man//Ravi is a class extending Man class
{
	public void weight()
	{
		System.out.println("Weight of Ravi is 60kg");
	}
	public void height()
	{
		System.out.println("Height of Ravi is 5.6");
	}
}
class Ramu extends Man//Ramu is a class extending Man class
{
	public void weight()
	{
		System.out.println("Weight of Ramu is 60kg");
	}
	public void height()
	{
		System.out.println("Height of Ramu is 5.6");
	}
}
class Rama extends Woman//Rama is a class extending Woman class
{
	public void weight()
	{
		System.out.println("Weight of Rama is 30kg");
	}
	public void height()
	{
		System.out.println("Height of Rama is 5.1");
	}
}
class Ramya extends Woman//Ramya is a class extending Woman class
{
	public void weight()
	{
		System.out.println("Weight of Ramya is 35kg");
	}
	public void height()
	{
		System.out.println("Height of Ramya is 4.9");
	}
}
public class Interface2
{
	public static void main(String args[])
	{
		Man man=new Ravi();//creating object for calling ravi's details
		man.hair();
		man.height();
		man.weight();
		man=new Ramu();//creating object for calling ramu's details
		man.hair();
		man.height();
		man.weight();
		Woman woman=new Rama();//creating object for calling rama's details
		woman.hair();
		woman.height();
		woman.weight();
		woman=new Ramya();//creating object for calling ramya's details
		woman.hair();
		woman.height();
		woman.weight();
	}
}
