package creatingMethodsByPattern;
import java.util.Scanner;
/**
 *  @author Fatih ARI - 21.08.2021
 * 
 *  According to the n value received from the user, the program is designed using a "Recursive" method without using a loop that follows the rule below.
 *  Rules:
 *  Subtract 5 from the entered number up to where the entered number is 0 or negative.
 *  During each subtraction, the last value is printed on the screen.
 *  After the number becomes negative or 0, 5 is added again.
 *  Again, in each addition operation, the last value of the number is printed on the screen. 
 * 
 */
public class Main {
    private static boolean sequence(int n, int temp) 
    {   
        if(temp<=0) 
        {
            int temp2=n; 
            n=temp;
            temp = temp2; 
        }    
        if(temp<=n){
            System.out.print(temp +" ");
            return sequence(n, temp-5); 
        }
        if(n+5==temp){
            System.out.print(n +" " + (n+5) +" ");
            return true;
        }
        if(n<temp)
        {
            System.out.print(n +" ");
            return sequence(n+5, temp); 
        }
        return false;
    }
    public static void main(String[] args) {
        clearScreen();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int temp = n;
        input.close();
        System.out.print("Output: ");
        sequence(n, temp);    
    }
    //It is used for console screen cleaning in Java.
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}

