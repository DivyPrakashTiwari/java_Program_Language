import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class prepared_Statement_JDBC {
    public static void main(String[] args) {
        // Define the MySQL database connection parameters
        String url = "jdbc:mysql://localhost:3306/myDatabase";
        String username = "myUsername";
        String password = "myPassword";

        System.out.println("Connecting to database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected successfully!");

            // SQL query to insert data into the GitHub table
            String sql = "INSERT INTO GitHub (id, name) VALUES (?,?)";

            // Create a PreparedStatement object for the SQL query
            PreparedStatement pstmt = connection.prepareStatement(sql);

            // Set the values for the placeholders
            pstmt.setInt(1, 1);
            pstmt.setString(2, "GitHub Copilot");

            // Execute the query to insert data into the GitHub table
            pstmt.executeUpdate();

            System.out.println("Data inserted successfully");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to the database!", e);
        }
    }
}