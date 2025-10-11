import java.util.Scanner;

import static java.lang.System.out;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int sub(int a, int b) {
        return a - b;
    }
    int mul(int a, int b) {
        return a * b;
    }
    int div(int a, int b) {
        return a / b;
    }
    int mod(int a, int b) {
        return a % b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        out.println ("Enter the first number: ");
        int a = sc.nextInt();
        out.println ("Enter the second number: ");
        int b = sc.nextInt();
        out.println("Addition of two numbers: " + calc.add( a, b));
        out.println("Substraction of two numbers: "+ calc.sub(a,b));
        out.println("Multiplication of two numbers: "+ calc.mul(a,b));
        out.println("Division of two numbers: "+ calc.div(a,b));
        out.println("Modulus of two numbers: "+ calc.mod(a,b));
        sc.close();
    }
}
