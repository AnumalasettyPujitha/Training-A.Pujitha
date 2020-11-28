package jdbcprogram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionEstablish.connect();
		PreparedStatement ps=con.prepareStatement("create table employee(eid int(10),ename varchar(20),esal int(20),experience int(10),gender varchar(10),email varchar(30),department varchar(20),mobile int(10))");
		int x=ps.executeUpdate();
		if(x==0)
			System.out.println("Table created");
	}

}
