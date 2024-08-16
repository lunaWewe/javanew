package tw.luna.pretty;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.sql.SQLException;

public class Luna40 {

	public static void main(String[] args) {
		
	}

}
 // 宣告拋出 throw + s
class Luna401 {
	void m1() throws IllegalAccessError, ObjectStreamException {

	}
}
// 拋出的錯誤範圍要比爸爸小
class Luna402 extends Luna401 {
//	void m1() throws SQLException {

//	}
}
