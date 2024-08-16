package tw.luna.pretty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import javax.sound.sampled.DataLine;
import javax.sql.rowset.JoinRowSet;


import com.mysql.cj.protocol.Resultset;

public class JDBC08 {

	public static void main(String[] args) {
	
		int rpp = 7; // row per page
		
		System.out.println("頁: ");
		Scanner scanner = new Scanner(System.in);
		int page = scanner.nextInt();
		int start = (page - 1) * rpp;

		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");

		String url = "jdbc:mysql://127.0.0.1:3306/luna";

		try {
			Connection conn = DriverManager.getConnection(url, prop);
			String sql = "SELECT * FROM gift ORDER BY id LIMIT ?, ?"; // 從哪裡開始, 讀幾筆資料
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, rpp);

			Statement stmt = conn.createStatement();
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String city = rs.getString("city");
				System.out.printf("%s. %s:%s\n", id, name, city);
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
