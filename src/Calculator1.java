
import java.util.Scanner;
class Calculator1 {
    static class Calculator{
        int add(int a, int b){
            return a+b;
        }
        int add(int a, int b, int c){
            return a+b+c;
        }
        double add(double x, double y, double z){
            return x+y+z;
        }
    }
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter the value of a : ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b =sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c =sc.nextInt();
        System.out.println("Enter the value of x : ");
        double x =sc.nextDouble();
        System.out.println("Enter the value of y : ");
        double y =sc.nextDouble();
        System.out.println("Enter the value of z : ");
        double z =sc.nextDouble();
        System.out.println("the sum of of a and b: "+calc.add(a,b));
        System.out.println("the sum of a and b and c is: " +calc.add(a,b,c));
        System.out.println("the sum of x and y and z is: " +calc.add(x,y,z));
    }
}