package jdbcprogram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/assignment7";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection Established");
		Statement st=con.createStatement();
		int x=st.executeUpdate("create table pen(company_name varchar(30),prie int(10))");
		if(x!=0)
			System.out.println("Table not created");
		else
			System.out.println("Table created");
	}

}
