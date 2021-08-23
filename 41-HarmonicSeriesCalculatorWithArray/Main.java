package harmonicSeriesCalculatorWithArray;

/**
 * @author Fatih ARI - 23.08.2021 A program that calculates the harmonic mean of
 *         the numbers in the array is designed.
 *
 */

public class Main {
    public static void main(String[] args) {
        clearScreen();
        int[] array = new int[] { 7, 2, 6, 12, 20, 5, 9 };
        double harmonicMean = 0.0;
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
            harmonicMean += 1 / (i * 1.0);
        }
        double count = array.length * 1.0;
        harmonicMean = count / harmonicMean;
        System.out.println("\nThe harmonic mean of the array: " + harmonicMean);
    }

    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
