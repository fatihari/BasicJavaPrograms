package findNearestNumberWithArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Fatih ARI - 23.08.2021
 * 
 *         Using Arrays, a program that finds the closest number smaller than
 *         the entered number and the closest closest number greater than the
 *         entered number is designed.
 *
 */

public class Main {
    public static void main(String[] args) {
        clearScreen();
        Scanner input = new Scanner(System.in);
        int[] array = { 15, 12, 788, 1, -1, -778, 2, 0 };

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int nearestSmallerNumber = array[0];
        int nearestGreaterNumber = array[0];
        for (int i : array) {

            if (i < number)
                nearestSmallerNumber = i;

            if (i > number) {
                nearestGreaterNumber = i;
                break;
            }
        }

        System.out.println("The nearest number smaller than the entered number is: " + nearestSmallerNumber);
        System.out.println("The nearest number greater than the entered number is: " + nearestGreaterNumber);
        input.close();

    }

    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
