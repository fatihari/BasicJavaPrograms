package fibonacciWithRecursive;
import java.util.Scanner;

/**
 *  @author Fatih ARI - 21.08.2021
 * 
 *  A program that finds the Fibonacci series with recursive function, whose number of elements is taken from the user , is designed.
 * 
 */

public class Main {

    private static int f(int index) 
    {
        if(index== 1)
            return 0;
        else if(index == 2)
        {
            return 1;
        }
        return f(index-1)+ f(index-2); //f(2) = f(0)+f(1)
    }

    public static void main(String[] args) {
        clearScreen();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        
        for (int i = 1; i <= number; i++) {
            System.out.print(f(i)+ " ");
        }
        System.out.println();
        
    }
 
    //It is used for console screen cleaning in Java.
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
