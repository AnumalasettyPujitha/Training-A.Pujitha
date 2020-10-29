class Employer
{
	int emp_id;
	String emp_name;
	long emp_mobile_number;
	float experience;
	String company_name="cvcorp";
	int salary;
	String email;
	String gender;
	int leaves_offered=20;
	int leaves_taken;
	Employer()//default constructor
	{
		emp_id=2;
		emp_name="Mahi";
		emp_mobile_number=1234567890;
		experience=25;
		salary=25000;
		email="null@gmail.com";
		gender="female";
		leaves_offered=25;
		leaves_taken=20;
	}
                  Employer(int id)//parameterized constructor
	{
                        this.emp_id=id;
	}
	void display()
	{
		System.out.println("ID is: "+emp_id);
		System.out.println("Name is: "+emp_name);
		System.out.println("Mobile number is: "+emp_mobile_number);
		System.out.println("Experience is: "+experience);
		System.out.println("Company name is : "+company_name);
		System.out.println("Salaryis: "+salary);
		System.out.println("email id is : "+email);
		System.out.println("Gender is : "+gender);
		System.out.println("leaves offered is : "+leaves_offered);
		System.out.println("leaves taken is : "+leaves_taken);
	}
}
class Employees
{
	public static void main(String args[])
	{
		Employer mahi=new Employer();
		System.out.println("==============Mahi Details============");
		mahi.display();
		Employer mahesh=new Employer(10);
		System.out.println("==============Mahesh Details============");
		mahesh.display();
	}
}
	
	