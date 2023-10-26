import java.sql.*;
public class DB_Con {
	public static void main(String args[]) {
		try {
			
			//Class.forName("com.sql.jdbc.Driver");
		
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/frist","root","Lish@123");
			
			
			Statement statement = conn.createStatement();
			
			ResultSet resultSet= statement.executeQuery("Select * from boy");
			
			while (resultSet.next()) {
			System.out.println(resultSet.getInt(1)+" | "+resultSet.getString(2)+" | "+resultSet.getInt(3));
				
			}
		} catch (Exception e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
	} 
}
