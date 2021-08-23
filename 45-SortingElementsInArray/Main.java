package sortingElementsInArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Fatih ARI - 23.08.2021
 * 
 *         Write a program that sorts the elements of an array from smallest to largest, taking the size and elements of the array from the user.
 *
 */

public class Main {
    public static void main(String[] args) 
    {
        clearScreen();
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the length of the array: ");
        int lengthOfArray = input.nextInt();
        int [] array = new int [lengthOfArray];
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print("Enter number "+(i+1) + " : ");
            array[i] = input.nextInt();
        }
        input.close();
        System.out.println("============================================");
        System.out.println("Entered Array:" + Arrays.toString(array));
        System.out.println("============================================");
        Arrays.sort(array);
        System.out.println("Sorted Array:" + Arrays.toString(array));
        System.out.println("============================================");

    }
    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
