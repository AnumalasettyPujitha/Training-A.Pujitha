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
}
class ExampleResume
{
	public static void main(String args[])
	{
		Resume suresh=new Resume();
		suresh.first_name="Suresh";
		suresh.last_name="Aallapaati";
		suresh.village="machili";
		suresh.mandal="patnam";
		suresh.district="medak";
		suresh.state="A.P.";
		suresh.CGPA_of_10th=9.0f;
		suresh.inter_percentage=93.1f;
		suresh.CGPA_of_BTech=7.6f;
		suresh.email="suresh@gmail.com";
		suresh.mobile_number=1234567890;
		suresh.technical_skills_known="C,Java,HTML";
		suresh.hobbies="playing chess, colouring rangoli";
		System.out.println("==========="+suresh.first_name+" "+suresh.last_name+" Resume");
		System.out.println("Name: "+suresh.first_name+" "+suresh.last_name);
		System.out.println("Address: "+suresh.village+", "+suresh.mandal+", "+suresh.district+", "+suresh.state);
		System.out.println("10th percentage: "+suresh.CGPA_of_10th);
		System.out.println("Inter percentage: "+suresh.inter_percentage);
		System.out.println("BTech percentage: "+suresh.CGPA_of_BTech);
		System.out.println("E-Mail id: "+suresh.email);
		System.out.println("Contact number: "+suresh.mobile_number);
		System.out.println("Technical Skills Known: "+suresh.technical_skills_known);
		System.out.println("Hobbies: "+suresh.hobbies);
		System.out.println(suresh.button);
	}
}
