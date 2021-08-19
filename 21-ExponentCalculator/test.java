package ExponentCalculator;
import java.util.Scanner;
/**
 *  @author Fatih ARI - 19.08.2021
 * 
 * A program is designed that calculates the exponential number with the values entered by the user using the for loop.
 * 
 */
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the exponential number: ");
        int x = input.nextInt();

        System.out.print("Enter the power of the exponential number: ");
        int y = input.nextInt();
        input.close();
        int exponentialNumber=1;
       
        for(int i = 0; i < y; i++)
        {
            exponentialNumber *= x;
        }
        System.out.print("x^y = " + x + "^" + y + " = " + exponentialNumber);
    }
}
