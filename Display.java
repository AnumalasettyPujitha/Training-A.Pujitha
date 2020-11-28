package jdbcprogram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Display {
	public static void display() throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEstablish.connect();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1.display all records 2.display particular record");
		int choice=sc.nextInt();
		if(choice==1) {
			String sql="Select * from employee";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getInt(8));
			}
		}
		if(choice==2){
			String sql="Select * from employee where eid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println("Enter employee id");
			ps.setInt(1,sc.nextInt());
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getInt(8));
			}
		}
	}
}
