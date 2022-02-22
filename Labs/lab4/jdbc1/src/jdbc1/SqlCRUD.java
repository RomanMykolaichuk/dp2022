package jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import crud.LabCRUDInterface;
import entity.User;

public class SqlCRUD implements LabCRUDInterface<User> {
	
	private Connection connection;

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(User t) {
		try(PreparedStatement st = 
			connection.prepareStatement("INSERT INTO entity (name,age)  VALUES(?,?)");)
		{
			st.setString(1, t.getName());
			st.setInt(2, t.getAge());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<User> read() {
		// TODO Auto-generated method stub
		List<User> result = new ArrayList<>();
		try(Statement st = connection.createStatement();
			ResultSet rs = 	st.executeQuery("SELECT * FROM entity");)
		{
			while(rs.next()) {
				result.add(new User(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		
		return result;
	}

	@Override
	public void update(int id, User t) {
		try(PreparedStatement st = 
				connection.prepareStatement("UPDATE entity SET \"name\"=?,age=? WHERE id=?");)
			{
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
		try(PreparedStatement st = 
				connection.prepareStatement("DELETE FROM entity WHERE id=?");)
			{
				st.setInt(1, id);
				st.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
