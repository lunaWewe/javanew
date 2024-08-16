package tw.luna.pretty;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class JDBC03 {

	public static void main(String[] args) {
		// Load Driver (Connector)
		// BUT, ...
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("OK");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			throw new RuntimeException();
		}

		String url1 = "jdbc:mysql://127.0.0.1:3306/luna?user=root&password=root";
//		try (Connection conn = DriverManager.getConnection(url1)) {
//			System.out.println("OK2");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		
		String url2 = "jdbc:mysql://127.0.0.1:3306/luna";
//		try (Connection conn = DriverManager.getConnection(url2,"root","root")) {
//			System.out.println("OK3");
//		} catch (Exception e) {
//			System.out.println(e);
//		}

		String url3 = "jdbc:mysql://127.0.0.1:3306/luna";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");

		try (Connection conn = DriverManager.getConnection(url3, "root", "root")) {
//			System.out.println("OK4");
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO cust (name,tel,birthday) VALUES ('Luna','123','1991-01-01')";
			sql += ",('Eric','111','1991-01-01')";
			sql += ",('Peter','2222','1991-01-01')";
			int n = stmt.executeUpdate(sql);
			System.out.println(n);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
