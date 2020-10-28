import java.util.*;
class Student   //to store the student details
{
	int student_id;
	String student_name;
	long mobile_number;
	int age;
	String gender;
	String email;
	String father_name;
	String address;
	static String clg_name;
	int student_class;
	int number_of_subjects;
	int number_of_days_present;
	static int total_working_days;
	int total_marks;
}
class Employee //to store the employee details
{
	int employee_id;
	String employee_name;
	int age;
	long mobile_number;
	String email;
	int salary;
	String designation;
	String gender;
	int experience;
	static String company_name;
}
class Variable //to access the student and employee details
{
	public static void main(String args[])
	{
		Student ramu=new Student(); // to store ramu's details
		ramu.student_id=203;
		ramu.student_name="Ramu";
		ramu.mobile_number=1234567890;
		ramu.age=10;
		ramu.gender="Male";
		ramu.email="ramu@gmail.com";
		ramu.father_name="Ramesh";
		ramu.address="manu street";
		ramu.clg_name="DBS";
		ramu.student_class=7;
		ramu.number_of_subjects=5;
		ramu.number_of_days_present=200;
		ramu.total_working_days=250;
		ramu.total_marks=500;
		System.out.println("======== "+ramu.student_name+"'s Details ========");
		System.out.println("id: "+ramu.student_id);
		System.out.println("mobile number: "+ramu.mobile_number);
		System.out.println("marks percentage: "+(double)(ramu.total_marks/ramu.number_of_subjects));
		Student rama=new Student(); // to store rama's details
		rama.student_name="Rama";
		System.out.println("======== "+rama.student_name+"'s Details ========");
		System.out.println("id: "+rama.student_id);
		System.out.println("mobile number: "+rama.mobile_number);
		System.out.println("College name: "+rama.clg_name);
		System.out.println("Total number of working days: "+rama.total_working_days);
		Employee sekhar=new Employee();//to store sekhar details
		System.out.println("======== Employee  Details ========");
		System.out.println(sekhar.experience);
	}
}
	
	