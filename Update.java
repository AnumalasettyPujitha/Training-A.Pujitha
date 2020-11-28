package jdbcprogram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	public static void update() throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEstablish.connect();
		Scanner sc=new Scanner(System.in);
		String sql="update employee set esal=esal-?";
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("Enter how much amount to be subtract");
		ps.setInt(1, sc.nextInt());
		int x=ps.executeUpdate();
		if(x!=0) {
			System.out.println("table updated");
		}
		
	}

}
