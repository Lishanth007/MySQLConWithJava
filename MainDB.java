import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainDB {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            if (connection != null) {
                System.out.println("Connected to the database!");
                // Perform database operations here

                // Remember to close the connection when you're done
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Connection failed. Check the error message below:");
            e.printStackTrace();
        }
    }
}
