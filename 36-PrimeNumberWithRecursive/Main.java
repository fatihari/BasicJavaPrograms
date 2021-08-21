package primeNumberWithRecursive;
import java.util.Scanner;
/**
 *  @author Fatih ARI - 21.08.2021
 * 
 *  The program is designed to check whether the number entered by the user is a prime number by using recursive methods.
 * 
 */
public class Main 
{
    public static boolean isPrime(int x, int y)
    {
        if(y==1)
            return true;
        if(x%y==0)
            return false;
        return isPrime(x, y-1);
    }   
    public static void main(String[] args) 
    {
        clearScreen();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        input.close();
        if(x>1)
        {
            int y = x/2; //x is divisible by its middle value at most. 
            if(isPrime(x,y))
                System.out.println("YES! " + x + " is prime a number.\n"); 
            else
                System.out.println("NO! " + x + " is NOT a prime number.\n");
        }
        else
            System.out.println("Please enter a number greater than 1!\n");
    }
    //It is used for console screen cleaning in Java.
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
