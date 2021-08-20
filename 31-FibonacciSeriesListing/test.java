package FibonacciSeriesListing;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 20.08.2021
 * 
 *  A program that finds the Fibonacci series, whose number of elements is taken from the user, is designed. 
 * 
 */

public class test {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of elements: ");
        int number = input.nextInt();
        int firstNumber = 0, secondNumber = 1, thirdNumber; 
        input.close();
        
        if(number==1)
            System.out.print(firstNumber+ " " ); //i=0 firstNumber
        else if(number>=2)
        {
            System.out.print(firstNumber+ " " + secondNumber + " "); //i=0 firstNumber, i=1 secondNumber
            for (int i = 3; i <= number; i++) 
            {
                thirdNumber = firstNumber+secondNumber;
                System.out.print(thirdNumber + " "); 
                if(i+1<=number)
                    i++;
                else
                    break;
                firstNumber = secondNumber + thirdNumber;
                System.out.print(firstNumber + " ");
                if(i+1<=number)
                    i++;
                else
                    break;    
                secondNumber = thirdNumber + firstNumber;
                System.out.print(secondNumber + " ");
            }
        }
        else
            System.out.println("Enter the number of elements greater than 0.");
        
        System.out.println("\n");
    }
}

