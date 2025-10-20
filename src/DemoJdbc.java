import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {
    /*
1.Import Package: Import necessary JDBC classes
2. Load Driver: Load the database driver class
3. Register Driver: Register driver with DriverManager
4. Create Connection: Establish connection to database
5. Create Statement: Create statement object for SQL execution
6. Execute Statement: Execute SQL queries/updates
7. Close Connection: Release database resources */
        String url = "jdbc:postgresql://localhost:5432/bankingdb";  // <-- database name required
        String uname = "postgres";   // your postgres username
        String pass = "6137";  // your postgres password
        Class.forName("org.postgresql.Driver");
        Connection con =DriverManager.getConnection(url,uname,pass);
        System.out.println("Connected to database successfully");
        con.close();
    }
}

