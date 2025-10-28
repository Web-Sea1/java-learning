import java.util.Scanner;
public class Xception {

        public static void main(String[] args){
            Scanner scanner =new Scanner(System.in);
            try{
                int[] numbers = {10,20,30,40,50};
                System.out.println("Enter the index values from 0 to 4: ");
                int index = scanner.nextInt();
                System.out.println("Value at index" +index+ ": "+ numbers[index]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error: Array out of bounds. please enter the values from 0 to 4");
            }catch (Exception e){
                System.out.println("Error: Invalid user input. please enter the integers");
            }
            finally{
                System.out.println("programme finished");
            }
        }
    }


