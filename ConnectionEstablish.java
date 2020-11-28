package jdbcprogram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionEstablish {
	public static Connection connect() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jnit";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		return con;
	}
}
