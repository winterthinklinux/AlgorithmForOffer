package beautiful;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//�о�һ��jdbc��ԭʼ��ɾ�Ĳ�
public class Jdbc {
	public static void main(String[] args) {
		//��������
	   try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//��������
	   String url = "jdbc:mysql://localhost:3306/test";
	   String username = "root";
	   String password = "123456";
	   try {
		Connection con = DriverManager.getConnection(url , username , password ) ;
		String sql="select * from employee921";
		Statement pstmt = con.createStatement() ;
		ResultSet rs = pstmt.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getString("name")+"  "+rs.getInt("salary"));
		}
	   } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	   //����preStatement
	   
	
	}
}
