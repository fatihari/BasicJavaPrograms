package AddingMultiplesOfFour;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 19.08.2021
 * 
 *  A program is designed that accepts inputs from the user until a single number is entered using loops and adds the numbers that are multiples of 4 from the entered values and prints them on the screen.
 * 
 */

public class test {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number, sum=0;
        do 
        {
            System.out.print("Enter the number: ");
            number = input.nextInt();
            if (number % 4 == 0)
                sum+=number;
        } while (number % 2 == 0); //Entering a negative number will terminate the loop.

        input.close();
        System.out.println("\nThe sum of the entered numbers that are a multiple of 4 is \"" + sum + "\".\n");
    }
}
