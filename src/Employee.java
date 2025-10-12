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
    Manager mgr = new Manager("Srinu",60000,"IT",6000);
    mgr.showDetails();
}
}