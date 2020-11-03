class School{
	void name()
	{
		System.out.println("School name is Algory");
	}
	class Library{
		 void book() {
			System.out.println("Number of books are 1000");
		}
	}
}
public class MemberInnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School algory=new School();
		algory.name();
		School.Library lib=algory.new Library();
		lib.book();
	}

}
