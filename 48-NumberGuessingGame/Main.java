package numberGuessingGame;

import java.util.Scanner;

/**
 * 
 * 
 *         A "Number Guessing Game" program has been designed in which the user is asked to guess a randomly selected number between 0-100. 
 *
 */

public class Main {
    public static void main(String[] args) {
        clearScreen();
        int number = (int) (Math.random() * 100);
        /*Random rand = new Random();
        int number = rand.nextInt(100);*/
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        while (right < 5) {
            System.out.println("===========================");
            System.out.print("Please enter your prediction: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number between 0 and 100. ");
                if (isWrong) {
                    right++;
                    System.out.println("You made too many incorrect entries. Your remaining right: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Your next wrong entry will be deducted from your rights.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, you guessed the hidden number " + number +" correctly. " );
                isWin = true;
                break;
            } else {
                System.out.println("You entered an incorrect number! ");
                if (selected > number) {
                    System.out.println("The number "+ selected + " is greater than the secret number.");
                } else {
                    System.out.println("The number "+ selected + " is smaller than the secret number.");
                }

                wrong[right++] = selected;
                System.out.println("Your remaining right is : " + (5 - right));
            }
        }
        input.close();
        if (!isWin) {
            System.out.println("You lost! The secret number was " + number);
            if (!isWrong) {
                System.out.println("===================");
                System.out.print("Your predictions: ");
                for (int i : wrong) {
                    if(i!=0)
                        System.out.print(i + " ");
                }
            }
        }
    }
    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
