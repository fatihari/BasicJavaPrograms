package minesweeperGame;

import java.util.Scanner;

/**
 * @author Fatih ARI - 26.08.2021
 * 
 *         "Minesweeper Game" was designed as the 50th and final program in basic Java. 
 *
 */

public class Main {
    public static void main(String[] args) {
        clearScreen();
        Scanner input = new Scanner(System.in);
        System.out.println("You need to choose game size!\n");
        System.out.print("Enter the number of row: ");
        int row = input.nextInt();
        System.out.print("Enter the number of column: ");
        int column = input.nextInt();
        System.out.println("");
        MineSweeper mSweeper = new MineSweeper(row, column);
        mSweeper.controlPanels();
        input.close();
    }
    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
