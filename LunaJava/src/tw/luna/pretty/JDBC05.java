package tw.luna.pretty;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBC05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name: ");
		String name = scanner.next();
		System.out.println("Tel: ");
		String tel = scanner.next();
		System.out.println("Birthday: ");
		String birthday = scanner.next();

		String url1 = "jdbc:mysql://127.0.0.1:3306/luna?user=root&password=root";

		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");

		try (Connection conn = DriverManager.getConnection(url1, prop)) {
			String sql = "INSERT INTO cust (name,tel,birthday) VALUES (?,?,?)";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(3, birthday);
			
			if (pstmt.executeUpdate() >0) {
				System.out.println("Insert success");
				
			}else {
				System.out.println("Failure");
				
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
