package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

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
		st.executeUpdate("delete from pen where company_name='fashion'");//deleting based on condition
		ResultSet rs=st.executeQuery("Select * from pen");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}
	}

}
