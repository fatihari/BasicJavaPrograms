package findingRecurringNumbers;

import java.util.Arrays;

/**
 * @author Fatih ARI - 23.08.2021
 * 
 *         A program is designed to find the repeating numbers in a given array.
 *
 */

public class Main {
    public static void main(String[] args) {
        clearScreen();
        int[] array = { 3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1 };
        System.out.print("\nGiven Array:  " + Arrays.toString(array));
        Arrays.sort(array);
        int[] rep = new int[array.length];
        int temp = array[0];
        System.out.print("\n\nSorted Array: " + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (temp == array[i]) {
                boolean flag = true;
                for (int j = 0; j < rep.length; j++) {
                    if (rep[j] == temp) {
                        flag = false;
                        break;
                    } else
                        flag = true;
                }
                if (flag) {
                    for (int j = 0; j < rep.length; j++) {
                        if (rep[j] == 0) {
                            rep[j] = temp;
                            break;
                        }
                    }
                }
            }
            temp = array[i];
        }

        System.out.println("\n\nRepeating Numbers: ");
        for (int i : rep) {
            if (i != 0)
                System.out.print(i + " ");
        }
    }

    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
