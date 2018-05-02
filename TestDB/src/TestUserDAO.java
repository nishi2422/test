

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

	public class TestUserDAO {

	String name = "";
	String password = "";
	public void selectByName(String name) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql ="select * from test_table where user_name=?";
		try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
		System.out.println(rs.getString("user_name"));
		System.out.println(rs.getString("password"));
		}
		} catch (SQLException e ) {
		e.printStackTrace();
		}
		try {
		con.close() ;
		} catch (SQLException e ) {
		e.printStackTrace();
		}
	}
	}