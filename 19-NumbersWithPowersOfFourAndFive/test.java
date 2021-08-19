package NumbersWithPowersOfFourAndFive;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 19.08.2021
 * 
 * A program that prints the powers of 4 and 5 up to the number entered using loops is designed.
 * 
 */

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.println("Powers of 4 and 5 up to \"" + number + "\":");
        for (int i = 1, j = 1; i<= number || j <= number; i*=5, j*=4) 
        {
            System.out.println(j);
            
            /* The power of five can be greater than the number entered. 
                Or, the power of four could be equal to the power of five (4 to the 0 = 5 to the power). 
                Therefore, the print code below was prevented from being printed with the continue command, it was skipped.                
            */        
            if(number<i || i==j) 
                continue;

            System.out.println(i);
        }
        input.close();
    }
}
