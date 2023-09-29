import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "";

        try {
            // Establish the connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            if (connection != null) {
                System.out.println("Connected to the database!");
                // You can perform database operations here.

                // Remember to close the connection when you're done.
                connection.close();
            } else {
                System.out.println("Failed to connect to the database!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
