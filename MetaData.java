package jdbcprogram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MetaData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionEstablish.connect();
		PreparedStatement ps=con.prepareStatement("Select * from student");
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println(rsmd.getColumnCount());//it returns the number of columns in the table
		for(int i=1;i<=rsmd.getColumnCount();i++) {
			System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));//returns column names and their types
		}
	}

}
