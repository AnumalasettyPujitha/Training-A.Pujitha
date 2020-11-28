package jdbcprogram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PSUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionEstablish.connect();
		Scanner sc=new Scanner(System.in);
		String sql="update student set smarks=smarks+?";
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("Enter how many marks to add");
		ps.setInt(1, sc.nextInt());
		ps.executeUpdate();
		ResultSet rs=ps.executeQuery("select * from student");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}
		sc.close();
	}

}
