class Resume
{
	String first_name;
	String last_name;
	String village;
	String mandal;
	String district;
	String state;
	float CGPA_of_10th;
	float inter_percentage;
	float CGPA_of_BTech;
	String email;
	long mobile_number;
	String technical_skills_known;
	String hobbies;
	static String button="Submit";
	//default constructor
	Resume()
	{
		first_name="Suresh";
		last_name="Aallapaati";
		village="machili";
		mandal="patnam";
		district="medak";
		state="A.P.";
		CGPA_of_10th=9.0f;
		inter_percentage=93.1f;
		CGPA_of_BTech=7.6f;
		email="suresh@gmail.com";
		mobile_number=1234567890;
		technical_skills_known="C,Java,HTML";
		hobbies="playing chess, colouring rangoli";
	}
	//parameterized constructor
	Resume(String first_name,String last_name,String village,String mandal,String district,String state,float CGPA_of_10th,float inter_percentage,float CGPA_of_BTech,String email,long mobile_number,String technical_skills_known,String hobbies,String button)
	{
		this.first_name=first_name;
		this.last_name=last_name;
		this.village=village;
		this.mandal=mandal;
		this.district=district;
		this.state=state;
		this.CGPA_of_10th=CGPA_of_10th;
		this.inter_percentage=inter_percentage;
		this.CGPA_of_BTech=CGPA_of_BTech;
		this.email=email;
		this.mobile_number=mobile_number;
		this.technical_skills_known=technical_skills_known;
		this.hobbies=hobbies;
		this.button=button;
	}
	//to display resume
	void display()
	{
		System.out.println("============"+first_name+" "+last_name+" Resume==========");
		System.out.println("Name: "+first_name+" "+last_name);
		System.out.println("Address: "+village+", "+mandal+", "+district+", "+state);
		System.out.println("10th percentage: "+CGPA_of_10th);
		System.out.println("Inter percentage: "+inter_percentage);
		System.out.println("BTech percentage: "+CGPA_of_BTech);
		System.out.println("E-Mail id: "+email);
		System.out.println("Contact number: "+mobile_number);
		System.out.println("Technical Skills Known: "+technical_skills_known);
		System.out.println("Hobbies: "+hobbies);
		System.out.println(button);
	}
}
public class ExampleConstructor
{
	public static void main(String args[])
	{
		Resume suresh=new Resume();
		suresh.display();
		Resume suma=new Resume("aalu","Suma","alimadugu","kvl","kanchi","telangana",98,91,76,"none@gmail.com",1234567809,"java,c","swimming","resume");
		suma.display();
	}
}
