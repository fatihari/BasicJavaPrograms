package SumOfDigitsOfNumber;
import java.util.Scanner;
/**
 *  @author Fatih ARI - 19.08.2021
 * 
 * A program that calculates the sum of the digits of a number entered by the user has been designed.
 * 
 */

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int yourNumberTemp = number;
        input.close();
        int sumOfDigits = 0;
        while(yourNumberTemp !=0)
        {                                         //     1           2           3         4
            sumOfDigits += yourNumberTemp % 10;   // 1643%10=3 // 164%10=4 // 16%10=6 // 1%10=1   
            yourNumberTemp /= 10;                 //1643/10=164//164/10=16 // 16/10=1 // 1/10=0 (for integer)
        }
        System.out.println("\nThe sum of the digits of the number " + number + " is \"" + sumOfDigits + "\".\n");
    }
}
