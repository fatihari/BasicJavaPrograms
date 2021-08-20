package FindMinMaxNumbers;

import java.util.Scanner;
/**
 *  @author Fatih ARI - 20.08.2021
 * 
 *  The program is designed to find the min and max values from N numbers entered by the user.
 * 
 */

public class test {
    public static void main(String[] args)
    {
        int max = 0, min = 9999;
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? : ");
        byte count = input.nextByte();
        int i=0;
        while(i!=count)
        {   
            System.out.print("Enter number "+ (i+1)+": ");
            int number = input.nextInt();
            if(number>max)
                max = number;
            if(number<min)
                min = number;
            i++;
        }
        input.close();
        System.out.println("\nThe maximum number is: " + max);
        System.out.println("The minimumum number is: " + min);
    }
}
