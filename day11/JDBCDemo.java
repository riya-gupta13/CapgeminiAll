package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		Connection connection = null;
		
//		1. Load the driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		2. Connection created
		
		try {
			 connection = DriverManager
	                .getConnection("jdbc:mysql://localhost/capgdb?user=root&password=rootroot");
			
//			3. Create & Fire queries
			
			Statement statement = connection.createStatement();
			/*	ResultSet resultSet = statement
            			.executeQuery("SELECT * from employee");
	
//				4. Get the result
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name= resultSet.getString(2);
				double salary = resultSet.getDouble(3);
				System.out.println(id + " : " + name + " : " + salary);
	}*/
	
		
			//inserting record
			PreparedStatement stmt=connection.prepareStatement("insert into employee values(?,?,?)");
			stmt.setInt(1, 5);
			stmt.setString(2, "Riyaaass");
			stmt.setDouble(3, 54634);
			int i=stmt.executeUpdate();
			System.out.println(i+ " record updated");
			
			//deleting record
			stmt=connection.prepareStatement("delete from employee where id=?");
			stmt.setInt(1,3);
			int j=stmt.executeUpdate();
			System.out.println(j+ " record deleted");
		}
		catch(SQLException sqe) {
			sqe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
//			5. Close the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	}

}