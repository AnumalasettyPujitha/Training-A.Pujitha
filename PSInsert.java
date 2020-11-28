package jdbcprogram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PSInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionEstablish.connect();
		Scanner sc=new Scanner(System.in);
		String choice;
		do {
			String sql="insert into student values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println("Enter student details");
			ps.setInt(1,sc.nextInt());
			ps.setString(2, sc.next());
			ps.setInt(3, sc.nextInt());
			ps.setString(4, sc.next());
			if(ps.executeUpdate()==1)
				System.out.println("Record inserted");
			System.out.println("Do you want to continue (y/n)");
			choice=sc.next();
		}while(choice.equals("y"));
		sc.close();
	}

}
