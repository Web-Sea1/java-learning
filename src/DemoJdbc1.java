import java.sql.*;
public class DemoJdbc1 {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/bankingdb";
        String name = "postgres";
        String password = "6137";
        Connection con=DriverManager.getConnection(url,name,password);
        System.out.println("Connected to database successfully");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select version();");
        if(rs.next()){
            System.out.println("PostgreSQL Version: " +rs.getString(1));
        }
        con.close();
    }
}
