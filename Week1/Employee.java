public class Employee {
        String name;
        int emp_Id;
        double sal;
        void employee_infor(String n,int Id, double salary) {
            this.name =n;
            this.emp_Id = Id;
            this.sal = salary;
        }
        void display() {
            System.out.println("Employee ID :" +emp_Id);
            System.out.println("Employe Name :" +name);
            System.out.println("Employee sal :" +sal);
        }
        public static void main(String[] args) {
            Employee e1 = new Employee();
            e1.employee_infor("Srinu", 101, 100000);
            Employee e2 = new Employee();
            e2.employee_infor("Venkat", 102, 200000);
            Employee e3= new Employee();
            e3.employee_infor("Vinodini",103, 300000);
            e1.display();
            e2.display();
            e3.display();

        }

    }


