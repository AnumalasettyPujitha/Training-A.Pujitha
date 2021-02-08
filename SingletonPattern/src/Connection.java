public class Connection {
	private static Connection con=null;
	
	public String s;
	private Connection() {
		s="This is private constructor";
	}
	
	public static Connection getConnection() {
		if(con==null)
			con=new Connection();
		return con;
	}
}
