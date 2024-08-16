package tw.luna.pretty;
import org.mindrot.BCrypt;

import tw.luna.pretty.if04;

public class Luna66 {

	public static void main(String[] args) {
		String passwd = "123456";
		String newpasswd = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(newpasswd);
		
		
		if(BCrypt.checkpw("123456", newpasswd)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
		// 加密演算法: 重新編碼過  不可逆 可透過演算法讀 
		// res
		// aes-128, aes-256
		
		// 壓縮演算法: 可逆  有可能壓縮後比原檔大
		
		

	}

}
