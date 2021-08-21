package palindromeChecker;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 21.08.2021
 * 
 *  A program has been designed to check whether a number is a "Palindrome Number". 
 * 
 */

public class Main {

    static int reverseNumber = 0;

    static int isPalindrome(int number) //241
    {
        reverseNumber = reverseNumber*10 + number % 10; //reverse=1
        number = number / 10; //24
        if(number==0)
        {
            return reverseNumber;
        }
        return isPalindrome(number);
    }

    public static void main(String[] args) {
        clearScreen();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        System.out.println("");
        if(number == isPalindrome(number))
            System.out.println("YES! The number "+ number + " is a palindrome number.");
        else
            System.out.println("NO! The number "+ number + " is NOT a palindrome number.");
    }

    //It is used for console screen cleaning in Java.
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

}
