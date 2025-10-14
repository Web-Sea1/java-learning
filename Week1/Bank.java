import java.util.Scanner;
class Andhra {

    public String state;
    public String capital;

    public Andhra(String state, String capital) {
        super();
        this.state = state;
        this.capital = capital;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getStates() {
        return "Andhra Pradesh";
    }

}

public class Bank extends Andhra{

    public Bank(String state, String capital) {
        super(state, capital);
    }

    static int currentBalance = 1000;
    public void greetCustomer() {
        System.out.println("Welcome to the AxisBank Dear Customer");
    }
    static void Deposit(int amount)
    {
        currentBalance = currentBalance+amount;
        System.out.println("Amount deposited successfully");
    }
    static void Withdrawl(int amount) {

        currentBalance = currentBalance-amount;
        System.out.println("Amount Withdrawl Successfully");
    }

    @Override
    public String getStates() {
        return "Maharastra";
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter int Damount:");
        System.out.println("Enter int Wamount:");
        int Damount = scanner.nextInt();
        int Wamount = scanner.nextInt();
        Bank customer = new Bank("Sreenu","Murthy");
        System.out.println(customer.getStates());
        Andhra a = new Bank("Sreenu","Murthy");
        System.out.println(a.getStates());
        Andhra b = new Andhra("Sreenu","Murthy");
        System.out.println(b.getStates());
        customer.greetCustomer();
        Deposit(Damount);
        System.out.println("Updated balance:" +currentBalance);
        Withdrawl(Wamount);
        System.out.println("updated balance:" +currentBalance);
    }

}

