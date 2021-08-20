package PrimeNumbersFinder;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 20.08.2021
 * 
 *  A program that prints the prime numbers up to the number entered by the user is designed.
 * 
 */

public class test {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int maxNumber = input.nextInt();
        System.out.println("");
        input.close();
        boolean primeControl = false;
        if(maxNumber>=2){
            System.out.print("2 ");
            for (int i = 3 ; i <= maxNumber; i++) 
            {      
                for (int j = 2; j < i; j++) 
                {
                    if(i % j == 0)
                    {
                        primeControl = false;
                        break;
                    }
                    else
                        primeControl = true; // may be prime number.
                }
                if(primeControl)
                    System.out.print(i + " ");
            }
        }
        else
        {
            System.out.println("Please enter a number greater than 1!");
        }
        System.out.println("\n");
    }
}
