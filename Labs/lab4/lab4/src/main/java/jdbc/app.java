package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import servlets.LabCRUDInterface;
import users.User1;

public class app {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		LabCRUDInterface crud = new SqlCRUD();
		Connection connection = new Connect().getCon();


		List<User1> list = new ArrayList<>();

		try (Statement st = connection.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM entity;");) {
			while (rs.next()) {
				list.add(new User1(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(list);

	}

}
