package jdbcprogram;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PSCreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionEstablish.connect();
		String sql="create table student(sid int(10),sname varchar(20),smarks int(10),section varchar(10))";
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println(ps.executeUpdate());//if table created it returns 0
	}

}
