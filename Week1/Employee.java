import java.util.Scanner;
class Employee {
    String name;
    double salary;

    //constructors
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

     void showDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }
}
    class Manager extends Employee {
        String department;
        double bonus;

        Manager(String name, double salary, String department, double bonus) {
            super(name, salary);
            this.department = department;
            this.bonus = bonus;
        }

        //overriding showDetails method
        void showDetails() {
            super.showDetails();
            System.out.println("Employee department: " + department);
            System.out.println("Employee bonus: " + bonus);
        }

public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Employee name: ");
            String name=scanner.nextLine();
            System.out.println("Enter Employee salary: ");
            double salary=scanner.nextDouble();
    scanner.nextLine();
            System.out.println("Enter Employee department: ");
            String department=scanner.nextLine();
            System.out.println("Enter Employee bonus: ");
            double bonus=scanner.nextDouble();
    Manager mgr = new Manager(name, salary,department, bonus);
    mgr.showDetails();

}
}