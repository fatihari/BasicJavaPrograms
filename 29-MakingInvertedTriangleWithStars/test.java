package MakingInvertedTriangleWithStars;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 20.08.2021
 * 
 * A program that draws an inverted triangle to the screen with asterisks (*) is designed using loops and the number of row is taken from the user. 
 
 *     row number: 5
        *********
         *******
          *****
           ***
            * 
 *
 */

public class test {
    public static void main(String[] args) 
    {   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int rowCount = input.nextInt();
        System.out.println("");
        input.close();

        for (int i = rowCount; i >= 1; i--) 
        {            
            for (int j = 0; j <= rowCount-i ; j++) 
            {
                System.out.print(" ");
            }
            for (int j = (2*i-1); j >= 1 ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}