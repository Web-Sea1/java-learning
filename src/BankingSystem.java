import java.sql.*;
import java.util.Scanner;

public class BankingSystem {
    static Connection con;
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/bankingdb";
            String uname = "postgres";
            String pass = "6137";
            Connection con = DriverManager.getConnection(url, uname, pass);
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("\n Banking System Menu");
                System.out.println("1. Create Account");
                System.out.println("2.Deposit");
                System.out.println("3.Withdrawl");
                System.out.println("4. Show Balance");
                System.out.println("5. Exit");
                System.out.println("Choose an option: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> createAccount(sc);
                    case 2 -> deposit(sc);
                    case 3 -> withdraw(sc);
                    case 4 -> showBalance(sc);
                    case 5 -> {
                        System.out.println("Exitingg....");
                        con.close();
                        return;
                    }
                    default -> System.out.println("Invalid choice");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    static void createAccount(Scanner sc) throws SQLException {
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Enter initial amount: ");
        double amount =sc.nextDouble();
        PreparedStatement ps = con.prepareStatement("INSERT INTO  accounts(name, balance) VALUES (?, ?)");
        ps.setString(1,name);
        ps.setDouble(2,amount);
        ps.executeUpdate();
        System.out.println("Account created successfully");
    }
    static void deposit(Scanner sc) throws SQLException {
        System.out.println("Enter the account number:");
        double acc_number = sc.nextDouble();
        System.out.println("Enter the amount to be deposited: ");
        double deposited_amount = sc.nextDouble();
        PreparedStatement ps = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE acc_no = ?");
       ps.setDouble(1, deposited_amount);
       ps.setDouble(2,acc_number);
    }
    static void withdraw(Scanner sc) throws SQLException {
        System.out.println("Enter the account number:");
        double acc_number = sc.nextDouble();
        System.out.println("Enter the amount to be withdrawn: ");
        double withdrawn_amount = sc.nextDouble();
        PreparedStatement ps = con.prepareStatement("SELECT balance FROM accounts WHERE acc_no = ?");
        ps.setDouble(1, acc_number);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            double balance = rs.getDouble(1);

            if (balance >= withdrawn_amount) {
                ps = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE acc_no = ?");
                ps.setDouble(1, acc_number);
                ps.setDouble(2, withdrawn_amount);
                ps.executeUpdate();
                System.out.println("Account withdrawn successfully");
            } else {
                System.out.println("Insufficient balance");
            }
        } else{

                System.out.println("Account not found");

        }
    }
    static void showBalance(Scanner sc) throws SQLException {
        System.out.println("Enter the account number: ");
        double acc_number = sc.nextDouble();
        PreparedStatement ps = con.prepareStatement("SELECT name, balance FROM accounts WHERE acc_no = ?");
        ps.setDouble(1, acc_number);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            System.out.println("Account holder name:" + rs.getString(1));
            System.out.println("Balance: " + rs.getDouble(2));

        }else{
            System.out.println("Account holder not found");
        }
    }
}




