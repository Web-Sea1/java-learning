
import java.util.Scanner;
public class Adder {
    static class Main {
        static int add(int a, int b) {
            return a + b;
        }

        static int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the value of a: ");
int a =scanner.nextInt();
System.out.println("Enter the value of b: ");
int b =scanner.nextInt();
System.out.println("Enter the value of c: ");
int c =scanner.nextInt();
System.out.println("sum of a and b is: " +Main.add(a,b));
System.out.println("sum of b and c is : " +Main.add(b,c));
System.out.println("sum of c and a is : " +Main.add(c,a));
System.out.println("sum of a and b and cis: " +Main.add(a,b,c));
System.out.println("sum of b and c and a is : " +Main.add(b,c,a));
System.out.println("sum of c and a and b is : " +Main.add(c,a, b));
    }
}
