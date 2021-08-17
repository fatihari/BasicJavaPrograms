package HypotenuseCalculator;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 17.08.2021
 *  A simple program is designed that calculates the hypotenuse 
 *  by taking the two sides of a right triangle from the user and prints it on the screen.
 *  
 */

public class test {
    
    static short edge_a, edge_b;
    static double edge_c;
     
    public static void gettingInputs()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the \"a\" edge: ");
        edge_a = input.nextShort();

        System.out.print("Enter the \"b\" edge: ");
        edge_b = input.nextShort();

        input.close();

    } 

    public static void euclideanCalculus()
    {
        edge_c = Math.sqrt(edge_a*edge_a+edge_b*edge_b);
        System.out.println("Hypotenuse \"(c edge)\" value is: " + edge_c);
    }

    public static void main(String[] args) 
    {
        gettingInputs();
        euclideanCalculus();
    }
}