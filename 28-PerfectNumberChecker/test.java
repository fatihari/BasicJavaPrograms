package PerfectNumberChecker;
import java.util.Scanner;
/**
 *  @author Fatih ARI - 20.08.2021
 * 
 *  A program is designed to print whether a number is a perfect number or not.
 * 
 *  A number whose sum of positive integer factors are equal to itself, excluding the number itself, is called a perfect number.
 * 
 */

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        int total = 0;
        for (int i = 1; i < number; i++) 
        {
            if(number % i == 0)
                total += i;
        }
        if(total==number)
            System.out.println("YES! \"" + number + "\" is a perfect number.\n");
        else
            System.out.println("NO! \"" + number + "\" is NOT a perfect number.\n");
    }
}
