package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecords {

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
		st.executeUpdate("Insert into pen values('fashion',20)");
		st.executeUpdate("Insert into pen values('fashion',30)");
		ResultSet rs=st.executeQuery("Select * from pen");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}
	}

}
