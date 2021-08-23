package creatingLetterB;

/**
 * @author Fatih ARI - 23.08.2021
 * 
 *         A program was designed to create the letter "B" with asterisks using arrays. 
 *
 */

public class Main {
    public static void main(String[] args) {
        clearScreen();
        String[][] array = new String[7][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    array[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    array[i][j] = " * ";
                } else {
                    array[i][j] = "   ";
                }
            }
        }

        for (String[] row : array) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
