package exponentCalculatorWithRecursive;
import java.util.Scanner;
/**
 *  @author Fatih ARI - 21.08.2021
 * 
 *  A program is designed that calculates the exponential number with the values entered by the user using the recursive methods.
 * 
 */
public class Main {
    private static int exponent(int x, int y) 
    {
        if(y==0)
            return 1;
        else if(y==1)
            return x;
        return x*exponent(x, y-1);
    }
    public static void main(String[] args) {
        clearScreen();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the exponential number: ");
        int x = input.nextInt();
        System.out.print("Enter the power of the exponential number: ");
        int y = input.nextInt();
        input.close();
        System.out.println(exponent(x, y));    
    }
    //It is used for console screen cleaning in Java.
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
