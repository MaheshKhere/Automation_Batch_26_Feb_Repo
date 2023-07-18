package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectWithSQL {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";

		Connection connectionurl = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/abc", "root",
				"mahesh@7028");

		// Connection connectionurl = DriverManager.getConnection("jdbc:mysql://" + host
		// + ":" + port + "tester", "root",
		// "mahesh@7028");
		// url- "jdbc:mysql//"+host+":"+port+"/database"
		Statement a = connectionurl.createStatement();
		ResultSet rs = a.executeQuery("select *from credential where username='mahesh';");
		while (rs.next()) {
			System.out.println(rs.getString("username")); // getString as string column labal
			System.out.println(rs.getString("pass"));
		}
	}
}
