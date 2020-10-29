import java.util.Scanner;
class BioData
{
	String full_name;
	int age;
	String gender;
	String village;
	String mandal;
	String district;
	String state;
	String father_name;
	String mother_name;
	float height;
	String colour;
	int salary;
	long mobile_number;
}
public class ScannerExample2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BioData user=new BioData();
		System.out.println("enter your full name: ");
		user.full_name=sc.next();
		System.out.println("enter your age: ");
		user.age=sc.nextInt();
		System.out.println("enter your gender: ");
		user.gender=sc.next();
		System.out.println("enter your village: ");
		user.village=sc.next();
		System.out.println("enter your mandal: ");
		user.mandal=sc.next();
		System.out.println("enter your district: ");
		user.district=sc.next();
		System.out.println("enter your state: ");
		user.state=sc.next();
		System.out.println("enter your father_name ");
		user.father_name=sc.next();
		System.out.println("enter your  mother_name: ");
		user. mother_name=sc.next();
		System.out.println("enter your height: ");
		user.height=sc.nextFloat();
		System.out.println("enter your colour: ");
		user.colour=sc.next();
		System.out.println("enter your salary: ");
		user.salary=sc.nextInt();
		System.out.println("enter your moile_number: ");
		user.mobile_number=sc.nextLong();
		System.out.println("==================user details===========");
		System.out.println(user.full_name);
		System.out.println(user.age);
		System.out.println(user.gender);
		System.out.println(user.village);
		System.out.println(user.mandal);
		System.out.println(user.district);
		System.out.println(user.state);
		System.out.println(user.father_name);
		System.out.println(user.mother_name);
		System.out.println(user.height);
		System.out.println(user.colour);
		System.out.println(user.salary);	
		System.out.println(user.mobile_number);	
	}
}		
		
		
		
		
		
	