package AverageOfNumbersDivisibleByTwelve;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 19.08.2021
 * 
 *  A program is designed to calculate the average of numbers dividing by 3 and 4, ie 12, from the numbers from 0 to the entered number using a loop.
 * 
 */

public class test {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the number: ");
        int number = input.nextInt();
        input.close();
        if(number >= 12)
        {
            for (int i = 1; i <= number; i++) {
                if(i % 12 == 0)
                {
                    sum += i;
                    count++;
                }
            }
            System.out.println("Numbers from 0 to \"" + number + "\" that are divisible by 12 have an average of \"" + sum/count +"\".");
        }
        else
            System.out.println("Please enter a number greater than 11.");
    }
}
