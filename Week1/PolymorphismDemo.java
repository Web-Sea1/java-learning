import java.util.Scanner;
public class PolymorphismDemo {
   static class Calculator{
       int add(int a, int b){
          return a+b;
      }
      int add(int a, int b, int c){
          return a+b+c;
      }
      double add(double a, double b, double c){
           return a+b+c;
      }
   }
   static class Employee{
       String name;
       double salary;
       Employee(String name, double salary){
           this.name = name;
           this.salary=salary;}
           void showDetails(){
               System.out.println("Employee name is: "+name);
               System.out.println("Employee salary is: "+salary);
           }
       }
       static class Manager extends Employee{
       String department;
       double bonus;

       Manager(String name, double salary, String department,double bonus) {
           super(name, salary);
           this.department = department;
           this.bonus = bonus;
       }
           void showDeltais(){
               super.showDetails();
               System.out.println("Manager Department is:" +department);
               System.out.println("Manager Bonus is: "+bonus);
           }
       }

       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //compile time polymorphism demo
       Calculator calc= new Calculator();
       System.out.println("the sum of a and b is " +calc.add(1,2));
       System.out.println("the sum of b and a is " +calc.add(1,2));
       System.out.println("the difference of a and b and c is " +calc.add(1,2,3 ));
       System.out.println("the difference of b and c and a is " +calc.add(1,2,3));
       System.out.println("the difference of c and a and b is " +calc.add(1,2,3));
       //runtime polymorphism demo
           System.out.println("\n---runtime polymorphism demo--");
           Employee e1= new Employee("Allice",5000000);
           Employee e2=new Manager("Srinu",1200000,"IT",600000);
           System.out.println("\n employee details:");
           e1.showDetails();
           System.out.println("\n manager details (via employee details):");
           e2.showDetails();
       }
       }



