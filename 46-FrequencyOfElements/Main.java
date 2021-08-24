package frequencyOfElements;

import java.util.Arrays;

/**
 * @author Fatih ARI - 24.08.2021
 * 
 *         A program is designed to find the new frequencies of how many times
 *         the elements are repeated in a given array.
 *
 */

public class Main {
    public static void main(String[] args) {
        clearScreen();
        int[] array = {1, 7, 20, 10, 10, 5, 20, 3};
        System.out.print("\nGiven Array:  " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.print("\n\nSorted Array: " + Arrays.toString(array));
        int[] rep = Arrays.copyOfRange(array, 0, array.length);
        
        //Array elements are kept in the first index,
        //Frequencies are kept in the second index.   
        int[][] frequencies = new int[array.length][2]; 
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            frequencies[i][0] = temp;
            frequencies[i][1]++;
            for (int j = i + 1; j < rep.length; j++) {
                if (temp == rep[j]) 
                    frequencies[i][1]++;
            }
            i += frequencies[i][1] - 1;
        }
        System.out.println("\n");
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i][1] != 0)
                System.out.println("The number " + frequencies[i][0] + " is repeated " + frequencies[i][1] + " times.");
        }
    }

    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
