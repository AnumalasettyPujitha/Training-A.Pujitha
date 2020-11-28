package jdbcprogram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	public static void delete() throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEstablish.connect();
		Scanner sc=new Scanner(System.in);
		String sql="delete from employee where eid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("Enter which record to be deleted");
		ps.setInt(1, sc.nextInt());
		int x=ps.executeUpdate();
		if(x!=0) {
			System.out.println("record deleted");
		}
		
	}

}
