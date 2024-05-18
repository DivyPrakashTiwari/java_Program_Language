import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class statement_JDBC{
    public static void main(String[] args) {
        // Define the MySQL database connection parameters
        String url = "jdbc:mysql://localhost:3306/myDatabase";
        String username = "myUsername";
        String password = "myPassword";

        System.out.println("Connecting to database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected successfully!");

            // Create a statement object to execute SQL queries
            Statement stmt = connection.createStatement();

            // SQL query to create a new table named 'GitHub' with 'id' and 'name' columns
            String sql = "CREATE TABLE GitHub (id INT PRIMARY KEY, name VARCHAR(255))";

            // Execute the SQL query to create the 'GitHub' table
            stmt.executeUpdate(sql);

            System.out.println("Table GitHub created successfully");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to the database!", e);
        }
    }
}