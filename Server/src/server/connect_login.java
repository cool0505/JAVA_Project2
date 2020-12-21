package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// login DB와 연결하기 위한 클래스
public class connect_login {

	public Connection makeconnect() {
		
		Connection conn = null;
	    
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        
	        // 이렇게 변경해주세요.
	        
	        // "root" => "MySQL 계정명"
	        // "Rlanwjd67!" => "MySQL 계정 비밀번호"
	        
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?serverTimezone=UTC", "root", "Rlanwjd67!");
	        
	        if(conn != null)
	        	System.out.println("> Login DB connect!");
	    } catch (SQLException ex) {
	        System.out.println("SQLException:" + ex);
	    } catch (Exception e) {
	        System.out.println("Exception:" + e);
	    }
	    
	    return conn;
		
	}
}
