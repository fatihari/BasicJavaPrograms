package transposeOfTheMatrix;

/**
 * @author Fatih ARI - 24.08.2021
 * 
 *         A program that finds the transpose of the matrix formed with a given
 *         multidimensional array is designed.
 *
 */
public class Main {
    public static void main(String[] args) {
        clearScreen();
        int[][] array = { { 0, 3, 6, 9, 2 }, { 5, 2, 5, 8, 1 }, { 4, 1, 4, 7, 0 }, { 3, 0, 3, 6, 9 } };
        int[][] transpose = new int[array[0].length][array.length];

        System.out.println("Matrix: ");
        for (int[] row : array) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                transpose[column][row] = array[row][column];
            }
        }
        System.out.println("\nTranspose: ");
        for (int[] row : transpose) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }

    }

    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
