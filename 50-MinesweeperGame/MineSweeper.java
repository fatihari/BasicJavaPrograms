package minesweeperGame;
import java.util.Scanner;

/**
 * @author Fatih ARI - 26.08.2021
 * 
 *         "Minesweeper Game" was designed as the 50th and final program in basic Java. 
 *
 */

public class MineSweeper {
    private String[][] solutionMap;
    private String[][] playerMap;
    private int row;
    private int col;
    private Scanner input;
    private int mineControlCounter;
    private int totalMine; // total number of mines on board
    private int totalElement; // number of non-mine elements on board
    private int dashCount; // ("-")
    private boolean flag;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        solutionMap = new String[row][col];
        playerMap = new String[row][col];
        totalMine = row * col / 4;
        totalElement = row * col - totalMine;
        input = new Scanner(System.in);
        flag = false;
    }

    public void controlPanels() {
        readSolutionBoard();
        do {   
            printPlayerBoard();
            addPlayerMove();
            if (this.dashCount-1 == totalMine)
                break;
    
        } while (!flag);

        if(this.dashCount-1 == totalMine && flag == false)
        {
            for (String[] row : solutionMap) {
                for (String col : row) 
                {
                    System.out.print(col + " ");    
                }
                System.out.println("");
            }
            System.out.println("Congratulations! You Won the Game!");
        }
        if(flag)
        {
            for (String[] row : solutionMap) {
                for (String col : row) 
                {
                    System.out.print(col + " ");    
                }
                System.out.println("");
            }
            System.out.println("You stepped on a mine! Game over! ");
        }

    }

    private void readSolutionBoard() {
        System.out.println("Welcome to Minesweeper Game!");
        if (row <= 1 || col <= 1)
            System.out.println("Please, Enter the number of rows and columns greater than 1! ");
        else {
            addMines();
            for (int i = 0; i < solutionMap.length; i++) {
                for (int j = 0; j < solutionMap[i].length; j++) {
                    if (solutionMap[i][j] == null)
                        solutionMap[i][j] = String.valueOf(controlFunction(i, j));
                    //System.out.print(solutionMap[i][j] + " ");
                }
                //System.out.println("");
            }
        }
    }

    private void printPlayerBoard() {
        if (row <= 1 || col <= 1)
            System.out.println("Please, Enter the number of rows and columns greater than 1! ");
        else 
        {
            
            this.dashCount = 0;
            for (int i = 0; i < playerMap.length; i++) {
                for (int j = 0; j < playerMap[i].length; j++) {
                    if (playerMap[i][j] == null) {
                        playerMap[i][j] = "-";
                        this.dashCount++;
                    }
                    else if(playerMap[i][j].equals("-"))
                    {
                        this.dashCount++;
                    }
                    System.out.print(playerMap[i][j] + " ");
                }
                System.out.println("");
            }
            
        }
        System.out.println("===================\n");
    }

    private void addPlayerMove() 
    {
        System.out.println("\n===================");
        System.out.print("Enter row number: ");
        int inputRowNumber = input.nextInt();
        System.out.print("Enter col number: ");
        int inputColNumber = input.nextInt();
        if (!playerMap[inputRowNumber][inputColNumber].equals("-"))
            System.out.println("The entered coordinate is already open. ");
        else {
            if (solutionMap[inputRowNumber][inputColNumber].equals("*")) 
            {
                flag = true;
            } 
            else {
                playerMap[inputRowNumber][inputColNumber] = solutionMap[inputRowNumber][inputColNumber];
            }

        }
        System.out.println("");
    }

    private void addMines() {
        for (int i = 0; i < totalMine; i++) {
            int rowLocation = (int) (Math.random() * this.row);
            int colLocation = (int) (Math.random() * this.col);
            if (solutionMap[rowLocation][colLocation] == null)
                solutionMap[rowLocation][colLocation] = "*";
            else // To prevent a mine from reoccurring in an existing location,
            {
                while (solutionMap[rowLocation][colLocation] != null) {
                    rowLocation = (int) (Math.random() * this.row);
                    colLocation = (int) (Math.random() * this.row);
                }
                solutionMap[rowLocation][colLocation] = "*";
            }
        }
        System.out.println("");
    }

    private void topLeft(int i, int j) {
        if (solutionMap[i][j + 1] == "*")
            this.mineControlCounter++;
        if (solutionMap[i + 1][j] == "*")
            this.mineControlCounter++;
        if (solutionMap[i + 1][j + 1] == "*")
            this.mineControlCounter++;
    }

    private void topRight(int i, int j) {
        if (solutionMap[i][j - 1] == "*")
            this.mineControlCounter++;
        if (solutionMap[i + 1][j - 1] == "*")
            this.mineControlCounter++;
        if (solutionMap[i + 1][j] == "*")
            this.mineControlCounter++;
    }

    private void bottomLeft(int i, int j) {
        if (solutionMap[i - 1][j] == "*")
            this.mineControlCounter++;
        if (solutionMap[i - 1][j + 1] == "*")
            this.mineControlCounter++;
        if (solutionMap[i][j + 1] == "*")
            this.mineControlCounter++;
    }

    private void bottomRight(int i, int j) {
        if (solutionMap[i - 1][j] == "*")
            this.mineControlCounter++;
        if (solutionMap[i - 1][j - 1] == "*")
            this.mineControlCounter++;
        if (solutionMap[i][j - 1] == "*")
            this.mineControlCounter++;
    }

    private int controlFunction(int i, int j) {

        mineControlCounter = 0;
        if (i == 0 && j == 0)
            topLeft(i, j);
        if (i == 0 && j == col - 1)
            topRight(i, j);
        if (i == row - 1 && j == 0)
            bottomLeft(i, j);
        if (i == row - 1 && j == col - 1)
            bottomRight(i, j);

        if (i == 0 && j > 0 && j < col - 1) { // Top Mid
            topLeft(i, j);
            topRight(i, j);
            if (solutionMap[i + 1][j] == "*") // Since it was collected 2 times above, it was subtracted once here.
                this.mineControlCounter--;
        }
        if (i > 0 && i < row - 1 && j == 0) { // Left Mid
            topLeft(i, j);
            bottomLeft(i, j);
            if (solutionMap[i][j + 1] == "*") // Since it was collected 2 times above, it was subtracted once here.
                this.mineControlCounter--;
        }
        if (i == row - 1 && j > 0 && j < col - 1) { // Bottom Mid
            bottomLeft(i, j);
            bottomRight(i, j);
            if (solutionMap[i - 1][j] == "*") // Since it was collected 2 times above, it was subtracted once here.
                this.mineControlCounter--;
        }
        if (i > 0 && i < row - 1 && j == col - 1) { // Right Mid
            topRight(i, j);
            bottomRight(i, j);
            if (solutionMap[i][j - 1] == "*") // Since it was collected 2 times above, it was subtracted once here.
                this.mineControlCounter--;
        }
        if (i > 0 && i < row - 1 && j > 0 && j < col - 1) { // Else
            if (solutionMap[i - 1][j - 1] == "*")
                mineControlCounter++;
            if (solutionMap[i - 1][j] == "*")
                mineControlCounter++;
            if (solutionMap[i - 1][j + 1] == "*")
                mineControlCounter++;
            if (solutionMap[i][j - 1] == "*")
                mineControlCounter++;
            if (solutionMap[i][j + 1] == "*")
                mineControlCounter++;
            if (solutionMap[i + 1][j - 1] == "*")
                mineControlCounter++;
            if (solutionMap[i + 1][j] == "*")
                mineControlCounter++;
            if (solutionMap[i + 1][j + 1] == "*")
                mineControlCounter++;
        }
        return mineControlCounter;
    }

}
