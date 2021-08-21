package advancedCalculator;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 21.08.2021
 * 
 *  In addition to addition, subtraction, multiplication and division, a calculator program with advanced functions has been designed by performing mathematical operations such as mode taking, finding exponential numbers, factorial calculation, finding the area and perimeter of a rectangle.
 * 
 */
public class Main 
{
    static int x, y, key;
    public static void gettingInputs()
    {
        Scanner input = new Scanner(System.in);
        while(key!=9){
            System.out.print("\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Exponent\n6-Factorial\n7-Modular\n8-Rectangular Perimeter and Area\n9-Exit\n");
            key = input.nextInt();
            if(key==9){
                System.out.println("See you later. Goodbye.");
                break;
            }
            System.out.print("Enter Number \"x\": ");
            x = input.nextInt();
            
            if(key!=6){ //in factorial calculation, there is only one number.
                System.out.print("Enter Number \"y\": ");
                y = input.nextInt();
            }
            System.out.println("");
            calculatorOperations();   
        }
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
            case 5:
                System.out.println("The result of the " + x + "^" + y + " exponent operation is: " + Math.pow(x,y));
                break;
            case 6:
                System.out.println("Result of factorial is " + facto(x)); 
                break;
            case 7:
                System.out.println("The result of the " + x + " % " + y + " modular operation is: " + x%y);
                break;
            case 8:
                System.out.println("The result of the perimeter of rectangular: " + 2*(x+y));
                System.out.println("The result of the area of rectangular: " + (x*y));
                break;

            default:
                System.out.println("An incorrect entry was made.");
                break;
        }
    }
    private static int facto(int x) 
    {
        int total=1;
        for (int i = 1; i <= x; i++) {
            total*=i;
        }
        return total;
    }
    public static void main(String[] args) 
    {
        clearScreen();
        gettingInputs();  
    }
    
    //It is used for console screen cleaning in Java.
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
