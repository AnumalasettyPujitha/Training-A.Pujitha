package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/assignment7";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection Established");
		Statement st=con.createStatement();
		System.out.println("Enter a record");
		st.executeUpdate("insert into pen(company_name,prie) values("+sc.next()+",'"+sc.nextInt()+"')");//insert records into pen table by using scanner class
		ResultSet rs=st.executeQuery("select * from pen");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}
		
	}

}
