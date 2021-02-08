
public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Connection connection=new Connection();//getting error because Connection() is private
		Connection connect=Connection.getConnection();
		String s="This is main class";
		System.out.println(connect.s);//it returns the value of s from Connection class
		System.out.println(s);//it returns the value of s from current class
	}

}
