import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static void main(String[] args) {
        // Define the URL, username, and password for the database connection
        String url = "jdbc:mysql://localhost:3306/myDatabase";
        String username = "myUsername";
        String password = "myPassword";

        // Print a message to indicate that the application is connecting to the database
        System.out.println("Connecting to database...");

        // Try to establish a connection to the database using the provided credentials
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // If the connection is successful, print a message indicating success
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            // If the connection fails, throw an IllegalStateException with a message and the original exception
            throw new IllegalStateException("Cannot connect to the database!", e);
        }
    }
}