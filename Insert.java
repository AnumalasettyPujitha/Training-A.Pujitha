package jdbcprogram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
	public static void insert() throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEstablish.connect();
		Scanner sc=new Scanner(System.in);
		String choice;
		do {
			String sql="insert into employee values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println("Enter employee details(eid,ename,esal,experience,gender,email,department,mobile");
			ps.setInt(1,sc.nextInt());
			ps.setString(2, sc.next());
			ps.setInt(3, sc.nextInt());
			ps.setInt(4, sc.nextInt());
			ps.setString(5, sc.next());
			ps.setString(6, sc.next());
			ps.setString(7, sc.next());
			ps.setInt(8, sc.nextInt());
			if(ps.executeUpdate()==1)
				System.out.println("Record inserted");
			System.out.println("Do you want to continue (y/n)");
			choice=sc.next();
		}while(choice.equals("y"));
		
	}
}
