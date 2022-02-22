package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import servlets.LabCRUDInterface;
import users.User1;

public class SqlCRUD implements LabCRUDInterface<User1> {

	
	Connection connection;
	
	
	public SqlCRUD() {
		
		this.connection = new Connect().getCon();
		System.out.println(connection);
		
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(User1 t) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection.prepareStatement("INSERT INTO entity (name,age) " + "VALUES (?,?)")) {
			st.setString(1, t.getName());
			st.setInt(2, t.getAge());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<User1> read() {
		// TODO Auto-generated method stub
		List<User1> list = new ArrayList<>();

		try (Statement st = connection.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM entity;");) {
			while (rs.next()) {
				list.add(new User1(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void update(int id, User1 t) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection
				.prepareStatement("UPDATE entity " + "SET \"name\"=?, \"age\"=? WHERE id=?;")) {
			st.setString(1, t.getName());
			st.setInt(2, t.getAge());
			st.setInt(3, id);
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection
				.prepareStatement("DELETE FROM entity WHERE id=?;")) {
			st.setInt(1, id);			
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
