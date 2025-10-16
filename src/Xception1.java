import java.util.Scanner;
public class Xception1
{
        public static void main(String[] args) {
            int numenator;
            int denominator;
            int result;
            Scanner scanner = new Scanner(System.in);
            try{
                System.out.println("Enter the Value for Numenator: ");
                numenator = scanner.nextInt();
                System.out.println("Enter the Value of Denomanator: ");
                denominator = scanner.nextInt();
                result = numenator/denominator;
                System.out.println("The result: " +result);
            }catch (ArithmeticException e) {
                System.out.println("Error: cannot divide by zero");
            }catch (Exception e){
                System.out.println("Invalid user input, input integers only");
            }finally{
                System.out.println("Programme finished");
            }
        }
    }

