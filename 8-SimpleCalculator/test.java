package SimpleCalculator;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 17.08.2021
 *  A simple calculator has been designed that allows four operations to be performed by asking the user to enter two different numbers. 
 *
 *
 */

public class test {
    static int x, y, key;

    public static void gettingInputs()
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        x = input.nextInt();

        System.out.print("Enter Second Number: ");
        y = input.nextInt();
        
        System.out.print("Type 1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division: ");
        key = input.nextInt();
        input.close();

    }

    public static void calculatorOperations()
    {
        switch (key) {
            case 1:
                System.out.println("Result of addition is " +(x+y));
                break;
            case 2:
                System.out.println("Result of subtraction is " + (x-y));
                break;
            case 3:
                System.out.println("Result of multiplication is " + (x*y));
                break;
            case 4:
                if(y!=0)
                    System.out.println("Result of division is " + ((float)x/(float)y));
                else
                    System.out.println("You made an incorrect entry.");
                break;
            default:
                System.out.println("An incorrect entry was made.");
                break;
        }
    }

    public static void main(String[] args) {
        gettingInputs();
        calculatorOperations();

    }    

}
